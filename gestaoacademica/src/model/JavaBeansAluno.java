package model;

public class JavaBeansAluno {
	
	private String idaluno;
	private String nomealuno;
	private String idturma;
	
	
	
	public JavaBeansAluno(String idaluno, String nomealuno, String idturma) {
		super();
		this.idaluno = idaluno;
		this.nomealuno = nomealuno;
		this.idturma = idturma;
	}
	
	
	public JavaBeansAluno() {
		super();
	}


	public String getIdaluno() {
		return idaluno;
	}
	public void setIdaluno(String idaluno) {
		this.idaluno = idaluno;
	}
	public String getNomealuno() {
		return nomealuno;
	}
	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}
	public String getIdturma() {
		return idturma;
	}
	public void setIdturma(String idturma) {
		this.idturma = idturma;
	}
	
	
	

	

}
