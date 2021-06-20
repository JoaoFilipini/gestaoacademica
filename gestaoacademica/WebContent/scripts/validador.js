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