	.file	"main.c"
	.intel_syntax noprefix
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	push	ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov	ebp, esp
	.cfi_def_cfa_register 5
	push	ebx
	sub	esp, 16
	.cfi_offset 3, -12
	call	__x86.get_pc_thunk.ax
	add	eax, OFFSET FLAT:_GLOBAL_OFFSET_TABLE_
	mov	DWORD PTR -8[ebp], 100
	mov	edx, DWORD PTR -8[ebp]
	mov	eax, DWORD PTR -8[ebp]
	imul	edx, eax
	mov	ecx, DWORD PTR -8[ebp]
	mov	eax, DWORD PTR -8[ebp]
	imul	eax, ecx
	lea	ebx, [edx+eax]
	mov	edx, DWORD PTR -8[ebp]
	mov	eax, DWORD PTR -8[ebp]
	imul	edx, eax
	mov	ecx, DWORD PTR -8[ebp]
	mov	eax, DWORD PTR -8[ebp]
	imul	ecx, eax
	mov	eax, DWORD PTR -8[ebp]
	add	ecx, eax
	mov	eax, DWORD PTR -8[ebp]
	imul	eax, ecx
	add	eax, edx
	lea	ecx, [ebx+eax]
	mov	edx, DWORD PTR -8[ebp]
	mov	eax, DWORD PTR -8[ebp]
	imul	eax, edx
	lea	edx, [ecx+eax]
	mov	eax, DWORD PTR -8[ebp]
	add	eax, edx
	mov	DWORD PTR -8[ebp], eax
	nop
	add	esp, 16
	pop	ebx
	.cfi_restore 3
	pop	ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.section	.text.__x86.get_pc_thunk.ax,"axG",@progbits,__x86.get_pc_thunk.ax,comdat
	.globl	__x86.get_pc_thunk.ax
	.hidden	__x86.get_pc_thunk.ax
	.type	__x86.get_pc_thunk.ax, @function
__x86.get_pc_thunk.ax:
.LFB1:
	.cfi_startproc
	mov	eax, DWORD PTR [esp]
	ret
	.cfi_endproc
.LFE1:
	.ident	"GCC: (Ubuntu 7.4.0-1ubuntu1~18.04.1) 7.4.0"
	.section	.note.GNU-stack,"",@progbits
