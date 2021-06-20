function validar() {
	let nomedisciplina = frmDiscip.nomedisciplina.value
	if (nomedisciplina === "") {
		alert('Preencha o campo Nome')
		frmDiscip.nomedisciplina.focus()
		return false
	} else {
		document.forms["frmDiscip"].submit()
	}
}