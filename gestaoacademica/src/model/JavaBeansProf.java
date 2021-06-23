package model;

public class JavaBeansProf {

	private String idprofessor;
	private String nomeprofessor;
	private String titulacao;
	
	
	public JavaBeansProf() {
		super();
	}
	
	
	public JavaBeansProf(String idprofessor, String nomeprofessor, String titulacao) {
		super();
		this.idprofessor = idprofessor;
		this.nomeprofessor = nomeprofessor;
		this.titulacao = titulacao;
	}

	
	public String getIdprofessor() {
		return idprofessor;
	}


	public void setIdprofessor(String idprofessor) {
		this.idprofessor = idprofessor;
	}


	public String getNomeprofessor() {
		return nomeprofessor;
	}


	public void setNomeprofessor(String nomeprofessor) {
		this.nomeprofessor = nomeprofessor;
	}


	public String getTitulacao() {
		return titulacao;
	}


	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}	
}
