package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;
import model.JavaBeansAluno;
import model.JavaBeansDiscip;
import model.JavaBeansProf;
import model.JavaBeansProfDiscip;
import model.JavaBeansTurma;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insertCurso", "/selectCurso", "/updateCurso", "/deleteCurso", 
							"/disciplina", "/insertDiscip", "/selectDiscip", "/updateDiscip", "/deleteDiscip",
							"/aluno", "/insertAluno", "/selectAluno", "/updateAluno", "/deleteAluno",
							"/prof", "/insertProf", "/selectProf", "/updateProf", "/deleteProf",
							"/turma", "/insertTurma", "/selectTurma", "/updateTurma", "/deleteTurma"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();
	JavaBeans curso = new JavaBeans();
	JavaBeansDiscip discip = new JavaBeansDiscip();
	JavaBeansAluno aluno = new JavaBeansAluno();
	JavaBeansProf prof = new JavaBeansProf();
	JavaBeansTurma turma = new JavaBeansTurma();
	JavaBeansProfDiscip profdiscip = new JavaBeansProfDiscip();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			cursos(request, response);
		} else if (action.equals("/insertCurso")) {
			adicionarCurso(request, response);
		} else if (action.equals("/selectCurso")) {
			listarCurso(request, response);
		} else if (action.equals("/updateCurso")) {
			editarCurso(request, response);
		} else if (action.equals("/deleteCurso")) {
			removerCurso(request, response);
			
		}else if (action.equals("/disciplina")) {
			disciplinas(request, response);
		}else if (action.equals("/insertDiscip")) {
			adicionarDisciplina(request, response);
		}else if (action.equals("/selectDiscip")) {
			listarDisciplina(request, response);
		}else if (action.equals("/updateDiscip")) {
			editarDisciplina(request, response);
		}else if (action.equals("/deleteDiscip")) {
			removerDisciplina(request, response);
		
			/*
		}else if (action.equals("/aluno")) {
			alunos(request, response);
		}else if (action.equals("/insertAluno")) {
			adicionarAluno(request, response);
		}else if (action.equals("/selectAluno")) {
			listarAluno(request, response);
		}else if (action.equals("/updateAluno")) {
			editarAluno(request, response);
		}else if (action.equals("/deleteAluno")) {
			removerAluno(request, response);
		}		
		*/
		}
		else {
			response.sendRedirect("index.html");
		}
	}

	protected void cursos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeans> lista = dao.listarCursos();

		request.setAttribute("cursos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("cursos.jsp");
		rd.forward(request, response);
	}

	protected void adicionarCurso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		curso.setNomecurso(request.getParameter("nomecurso"));
		curso.setPeriodicidade(request.getParameter("periodicidade"));
		curso.setDescricao(request.getParameter("descricao"));

		dao.inserirCurso(curso);

		response.sendRedirect("main");
	}
	
	protected void listarCurso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		curso.setIdcurso(request.getParameter("idcurso"));
		dao.selecionarCurso(curso);
		request.setAttribute("idcurso", curso.getIdcurso());
		request.setAttribute("nomecurso", curso.getNomecurso());
		request.setAttribute("periodicidade", curso.getPeriodicidade());
		request.setAttribute("descricao", curso.getDescricao());
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);

	}
	
	
	protected void editarCurso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		curso.setIdcurso(request.getParameter("idcurso"));
		curso.setNomecurso(request.getParameter("nomecurso"));
		curso.setPeriodicidade(request.getParameter("periodicidade"));
		curso.setDescricao(request.getParameter("descricao"));
		dao.alterarCurso(curso);
		response.sendRedirect("main");
	}
	
	
	protected void removerCurso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		curso.setIdcurso(request.getParameter("idcurso"));
		dao.deletarCurso(curso);
		response.sendRedirect("main");
	}
	
			
	
	protected void disciplinas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeansDiscip> lista = dao.listarDisciplinas(request.getParameter("idcurso"));

		request.setAttribute("disciplinas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("disciplina.jsp");
		rd.forward(request, response);
	}
	
	protected void adicionarDisciplina(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//String id = request.getParameter("idcurso");
		discip.setNomedisciplina(request.getParameter("nomedisciplina"));
		discip.setCargahoraria(request.getParameter("cargahoraria"));
		discip.setEmenta(request.getParameter("ementa"));
		
		dao.inserirDisciplina(discip, request.getParameter("idcurso"));

		response.sendRedirect("main");
	}
	
	protected void listarDisciplina(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		curso.setIdcurso(request.getParameter("idcurso"));
		dao.selecionarDisciplina(discip);
		request.setAttribute("iddisciplina", discip.getIddisciplina());
		request.setAttribute("nomedisciplina", discip.getNomedisciplina());
		request.setAttribute("cargahoraria", discip.getCargahoraria());
		request.setAttribute("ementa", discip.getEmenta());
		RequestDispatcher rd = request.getRequestDispatcher("editarDiscip.jsp");
		rd.forward(request, response);

	}
	
	
	protected void editarDisciplina(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		discip.setIddisciplina(request.getParameter("iddisciplina"));
		discip.setNomedisciplina(request.getParameter("nomedisciplina"));
		discip.setCargahoraria(request.getParameter("cargahoraria"));
		discip.setEmenta(request.getParameter("ementa"));
		dao.alterarDisciplina(discip);
		response.sendRedirect("main");
	}
	
	
	protected void removerDisciplina(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		discip.setIddisciplina(request.getParameter("iddisciplina"));
		dao.deletarDisciplina(discip);
		response.sendRedirect("main");
	}
	
	
	/*
	protected void alunos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeansAluno> lista = dao.listarAlunos(request.getParameter("idaluno"));

		request.setAttribute("disciplinas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("disciplina.jsp");
		rd.forward(request, response);
	}
	
	protected void adicionarAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//String id = request.getParameter("idcurso");
		discip.setNomedisciplina(request.getParameter("nomedisciplina"));
		discip.setCargahoraria(request.getParameter("cargahoraria"));
		discip.setEmenta(request.getParameter("ementa"));
		
		dao.inserirDisciplina(discip, request.getParameter("idcurso"));

		response.sendRedirect("main");
	}
	
	protected void listarAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		curso.setIdcurso(request.getParameter("idcurso"));
		dao.selecionarDisciplina(discip);
		request.setAttribute("iddisciplina", discip.getIddisciplina());
		request.setAttribute("nomedisciplina", discip.getNomedisciplina());
		request.setAttribute("cargahoraria", discip.getCargahoraria());
		request.setAttribute("ementa", discip.getEmenta());
		RequestDispatcher rd = request.getRequestDispatcher("editarDiscip.jsp");
		rd.forward(request, response);

	}
	
	
	protected void editarAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		discip.setIddisciplina(request.getParameter("iddisciplina"));
		discip.setNomedisciplina(request.getParameter("nomedisciplina"));
		discip.setCargahoraria(request.getParameter("cargahoraria"));
		discip.setEmenta(request.getParameter("ementa"));
		dao.alterarDisciplina(discip);
		response.sendRedirect("main");
	}
	
	
	protected void removerAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		discip.setIddisciplina(request.getParameter("iddisciplina"));
		dao.deletarDisciplina(discip);
		response.sendRedirect("main");
	}
	
	*/
		
}
