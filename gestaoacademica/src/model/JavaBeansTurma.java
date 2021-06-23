package model;

public class JavaBeansTurma {

	private String idturma;
	private String descricao;
	private String idcurso;
	private String idprofdisp;
	
	
	
	public JavaBeansTurma() {
		super();
	}
	
	
	public JavaBeansTurma(String idturma, String descricao, String idcurso, String idprofdisp) {
		super();
		this.idturma = idturma;
		this.descricao = descricao;
		this.idcurso = idcurso;
		this.idprofdisp = idprofdisp;
	}

	
	public String getIdturma() {
		return idturma;
	}


	public void setIdturma(String idturma) {
		this.idturma = idturma;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getIdcurso() {
		return idcurso;
	}


	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}


	public String getIdprofdisp() {
		return idprofdisp;
	}


	public void setIdprofdisp(String idprofdisp) {
		this.idprofdisp = idprofdisp;
	}	
}
