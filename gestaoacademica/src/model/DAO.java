package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	/** Conexão **/

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbacademico?useTimezone=true&serverTimezone=UTC";

	private String user = "root";
	private String password = "admin";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/*public void teste() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

	public void inserirCurso(JavaBeans curso) {
		String create = "insert into curso (nomecurso, periodicidade, descricao) values (?,?,?)";

		try {
			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(create);

			pst.setString(1, curso.getNomecurso());
			pst.setString(2, curso.getPeriodicidade());
			pst.setString(3, curso.getDescricao());

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public ArrayList<JavaBeans> listarCursos(){
		
		ArrayList<JavaBeans> cursos = new ArrayList<>();
		String read = "select * from curso order by nomecurso";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String idcurso = rs.getString(1);
				String nomecurso = rs.getString(2);
				String periodicidade = rs.getString(3);
				String descricao = rs.getString(4);
				
				cursos.add(new JavaBeans(idcurso, nomecurso, periodicidade, descricao));
			}
			con.close();
			return cursos;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionarCurso(JavaBeans curso) {
		String read2 = "select * from curso where idcurso = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, curso.getIdcurso());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				curso.setIdcurso(rs.getString(1));
				curso.setNomecurso(rs.getString(2));
				curso.setPeriodicidade(rs.getString(3));
				curso.setDescricao(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void alterarCurso(JavaBeans curso) {
		String update = "update curso set nomecurso=?,periodicidade=?,descricao=? where idcurso=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, curso.getNomecurso());
			pst.setString(2, curso.getPeriodicidade());
			pst.setString(3, curso.getDescricao());
			pst.setString(4, curso.getIdcurso());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void deletarCurso(JavaBeans curso) {
		String delete = "delete from curso where idcurso=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, curso.getIdcurso());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public ArrayList<JavaBeansDiscip> listarDisciplinas(String idcurso){
		
		ArrayList<JavaBeansDiscip> disciplinas = new ArrayList<>();
		String read = "select * from disciplina where idcurso = ?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			pst.setString(1, idcurso);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String iddisciplina = rs.getString(1);
				String nomedisciplina = rs.getString(2);
				String cargahoraria = rs.getString(3);
				String ementa = rs.getString(4);
				
				disciplinas.add(new JavaBeansDiscip(iddisciplina, nomedisciplina, cargahoraria, ementa));
			}
			con.close();
			return disciplinas;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	public void inserirDisciplina(JavaBeansDiscip disciplina, String idcurso) {
		String create = "insert into disciplina (nomedisciplina, cargahoraria, ementa, idcurso) values (?,?,?,?)";
	
		
		try {
			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(create);			

			pst.setString(1, disciplina.getNomedisciplina());
			pst.setString(2, disciplina.getCargahoraria());
			pst.setString(3, disciplina.getEmenta());
			
			
			pst.setString(4, idcurso);			

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void selecionarDisciplina(JavaBeansDiscip discip) {
		String read2 = "select * from disciplina where iddisciplina = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, discip.getIddisciplina());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				discip.setIddisciplina(rs.getString(1));
				discip.setNomedisciplina(rs.getString(2));
				discip.setCargahoraria(rs.getString(3));
				discip.setEmenta(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void alterarDisciplina(JavaBeansDiscip discip) {
		String update = "update disciplina set nomedisciplina=?,cargahoraria=?,ementa=? where iddisciplina=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, discip.getNomedisciplina());
			pst.setString(2, discip.getCargahoraria());
			pst.setString(3, discip.getEmenta());
			pst.setString(4, discip.getIddisciplina());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void deletarDisciplina(JavaBeansDiscip discip) {
		String delete = "delete from disciplina where iddisciplina=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, discip.getIddisciplina());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	


}
