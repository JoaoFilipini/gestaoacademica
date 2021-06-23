/**
 * 
 */


function confirmar(idcurso) {
	let resposta = confirm("Confirma a exclusão deste curso?")
	if (resposta === true) {
		window.location.href = "deleteCurso?idcurso=" + idcurso
	}
}

function confirmarDiscip(iddisciplina) {
	let resposta = confirm("Confirma a exclusão desta Disciplina?")
	if (resposta === true) {
		window.location.href = "deleteDiscip?iddisciplina=" + iddisciplina
	}
}