/**
 * 
 */


function confirmar(idcurso) {
	let resposta = confirm("Confirma a exclusão deste curso?")
	if (resposta === true) {
		window.location.href = "deleteCurso?idcurso=" + idcurso
	}
}