package model;

public class JavaBeansProfDiscip {

	private String idprofdiscip;
	private JavaBeansProf idprofessor;
	private JavaBeansDiscip iddisciplina;
	
	public JavaBeansProfDiscip() {
		super();
	}

	public JavaBeansProfDiscip(String idprofdiscip, JavaBeansProf idprofessor, JavaBeansDiscip iddisciplina) {
		super();
		this.idprofdiscip = idprofdiscip;
		this.idprofessor = idprofessor;
		this.iddisciplina = iddisciplina;
	}

	public String getIdprofdiscip() {
		return idprofdiscip;
	}

	public void setIdprofdiscip(String idprofdiscip) {
		this.idprofdiscip = idprofdiscip;
	}

	public JavaBeansProf getIdprofessor() {
		return idprofessor;
	}

	public void setIdprofessor(JavaBeansProf idprofessor) {
		this.idprofessor = idprofessor;
	}

	public JavaBeansDiscip getIddisciplina() {
		return iddisciplina;
	}

	public void setIddisciplina(JavaBeansDiscip iddisciplina) {
		this.iddisciplina = iddisciplina;
	}
	
	
	
	
	
	
	
}
