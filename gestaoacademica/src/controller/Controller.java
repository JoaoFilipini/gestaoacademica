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
import model.JavaBeansDiscip;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insertCurso", "/selectCurso", "/updateCurso", "/deleteCurso", "/disciplinas" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();
	JavaBeans curso = new JavaBeans();

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
		}else if (action.equals("/disciplinas")) {
			disciplinas(request, response);
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

		curso.setNomecurso(request.getParameter("nome"));
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
	
		
	/*protected void disciplina(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		curso.setIddisciplina(request.getParameter("idcurso"));
		dao.selecionarDisciplina(curso);
		request.setAttribute("iddisciplina", curso.getIddisciplina());
		request.setAttribute("nomedisciplina", curso.getNomedisciplina());
		request.setAttribute("cargahoraria", curso.getCargahoraria());
		request.setAttribute("ementa", curso.getEmenta());
		RequestDispatcher rd = request.getRequestDispatcher("disciplina.jsp");
		rd.forward(request, response);
	}*/
	
	
	
	protected void disciplinas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeansDiscip> lista = dao.listarDisciplinas();

		request.setAttribute("disciplinas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("disciplina.jsp");
		rd.forward(request, response);
	}
}
