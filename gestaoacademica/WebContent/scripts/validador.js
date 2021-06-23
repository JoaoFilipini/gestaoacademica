function validar() {
	let nomecurso = frmCurso.nomecurso.value
	let periodicidade = frmCurso.periodicidade.value
	if (nomecurso === "") {
		alert('Preencha o campo Nome')
		frmCurso.nomecurso.focus()
		return false
	} else if (periodicidade === "") {
		alert('Preencha o campo Periodicidade')
		frmCurso.periodicidade.focus()
		return false
	} else {
		document.forms["frmCurso"].submit()
	}
}

function validarDiscip() {
	let nomedisciplina = frmDiscip.nomedisciplina.value
	if (nomedisciplina === "") {
		alert('Preencha o campo Nome')
		frmDiscip.nomedisciplina.focus()
		return false
	} else {
		document.forms["frmDiscip"].submit()
	}
}