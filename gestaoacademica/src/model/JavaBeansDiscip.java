package model;

public class JavaBeansDiscip {

	private String iddisciplina;
	private String nomedisciplina;
	private String cargahoraria;
	private String ementa;
	private JavaBeans idcurso;



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
	
	public JavaBeansDiscip(String iddisciplina, String nomedisciplina, String cargahoraria, String ementa, JavaBeans idcurso) {
		super();
		this.iddisciplina = iddisciplina;
		this.nomedisciplina = nomedisciplina;
		this.cargahoraria = cargahoraria;
		this.ementa = ementa;
		this.idcurso = idcurso;
	}
	

	
	public String getIddisciplina() {
		return iddisciplina;
	}


	public String getIdcurso() {
		return idcurso.toString();
	}


	public void setIdcurso(JavaBeans idcurso) {
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
