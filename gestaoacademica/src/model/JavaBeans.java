package model;

public class JavaBeans {
	private String idcurso;
	private String nomecurso;
	private String periodicidade;
	private String descricao;
	
	public JavaBeans() {
		super();
	}
	
	
	public JavaBeans(String idcurso, String nomecurso, String periodicidade, String descricao) {
		super();
		this.idcurso = idcurso;
		this.nomecurso = nomecurso;
		this.periodicidade = periodicidade;
		this.descricao = descricao;
	}
	

	public String getIdcurso() {
		return idcurso;
	}


	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}


	public String getNomecurso() {
		return nomecurso;
	}


	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}


	public String getPeriodicidade() {
		return periodicidade;
	}


	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

	
	
}
