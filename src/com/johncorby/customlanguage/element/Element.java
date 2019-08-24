package com.johncorby.customlanguage.element;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static com.johncorby.customlanguage.Util.cassert;
import static com.johncorby.customlanguage.Util.filterClass;

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
                this + " already exists");
        elements.add(this);
    }

    /**
     * get element by type/subtype
     */
    public static <E extends Element> Set<E> get(Class<E> type) {
        return filterClass(elements, type)
                .collect(Collectors.toSet());
    }

    /**
     * get element by type/subtype and name
     */
    public static <E extends Element> E get(Class<E> type, String name) {
        for (var e : get(type))
            if (Objects.equals(e.name, name))
                return e;
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
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append(name)
                .toString();
    }

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
