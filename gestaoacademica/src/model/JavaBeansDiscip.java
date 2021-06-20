package model;

public class JavaBeansDiscip {

	private String iddisciplina;
	private String nomedisciplina;
	private String cargahoraria;
	private String ementa;
	private String idcurso;



	public JavaBeansDiscip() {
		super();
	}
	
	
	public JavaBeansDiscip(String iddisciplina, String nomedisciplina, String cargahoraria, String ementa) {
		super();
		this.iddisciplina = iddisciplina;
		this.nomedisciplina = nomedisciplina;
		this.cargahoraria = cargahoraria;
		this.ementa = ementa;
	}

	
	public String getIddisciplina() {
		return iddisciplina;
	}


	public String getIdcurso() {
		return idcurso;
	}


	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}


	public void setIddisciplina(String iddisciplina) {
		this.iddisciplina = iddisciplina;
	}


	public String getNomedisciplina() {
		return nomedisciplina;
	}


	public void setNomedisciplina(String nomedisciplina) {
		this.nomedisciplina = nomedisciplina;
	}


	public String getCargahoraria() {
		return cargahoraria;
	}


	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}


	public String getEmenta() {
		return ementa;
	}


	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}	
}
