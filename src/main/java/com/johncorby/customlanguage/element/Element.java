package com.johncorby.customlanguage.element;

import org.antlr.v4.runtime.misc.Pair;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static com.johncorby.customlanguage.Util.cassert;

/**
 * storage of programming elements
 */
public abstract class Element {
    public static final Set<Element> elements = new HashSet<>();

    public final String name;

    /**
     * define this element
     */
    public Element(String name) {
        this.name = name;

        cassert(!elements.contains(this),
                String.format("%s %s already exists", getClass().getSimpleName(), name));
        elements.add(this);
    }

    /**
     * get element by features using reflection
     *
     * @param features list of {name, value} arrays that will be matched
     */
    @SafeVarargs
    public static <E extends Element> E get(Pair<String, ?>... features) {
        for (Element element : elements)
            for (var feature : features) {
                var name = feature.a;
                var value = feature.b;

                try {
                    var thisValue = element.getClass().getField(name).get(element);

                    if (Objects.equals(thisValue, value)) return (E) element;
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        return null;
    }

    /**
     * undefine this element
     */
    public void undefine() {
        elements.remove(this);
    }

    /**
     * get assembly used to obtain this element
     */
    public abstract String getAsm();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
