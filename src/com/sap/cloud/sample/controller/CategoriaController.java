package com.sap.cloud.sample.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sap.cloud.sample.beans.CategoriaBean;
import com.sap.cloud.sample.beans.CategoriaBeanList;
import com.sap.cloud.sample.beans.UsuarioBean;
import com.sap.cloud.sample.beans.UsuarioBeanList;
import com.sap.cloud.sample.dao.CategoriaDAO;
import com.sap.cloud.sample.dao.UsuarioDAO;
import com.sap.cloud.sample.model.Categoria;
import com.sap.cloud.sample.model.Usuario;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/CategoriaController")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoriaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession();
		Usuario usuarioConectado = (Usuario) httpSession.getAttribute("usuarioLogado");
		if (usuarioConectado == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			String action = request.getParameter("action");
			Categoria categoria = null;
			if (action != null) {
				String id = request.getParameter("f_categoriaId");
				CategoriaDAO categoriaDAO = new CategoriaDAO();

				if (id != null && id != "") {
					categoria = categoriaDAO.selectById(new Long(id));
				} else {
					categoria = new Categoria();
				}
				if (action.equals("Salvar")) {
					String nomeCategoria = request.getParameter("f_nomeCategoria");
					String complementoCategoria = request.getParameter("f_categoriaComplemento");
					categoria.setNome(nomeCategoria);
					categoria.setComplemento(complementoCategoria);

					if (categoria.getId() == null) {
						categoriaDAO.insert(categoria);
					} else {
						categoriaDAO.update(categoria);
					}
					categoria = null;
				} else {
					if (action.equals("Excluir")) {
						categoriaDAO.delete(categoria);
						categoria = null;
					}
				}
			}

			CategoriaBean categoriaBean = null;
			if (categoria != null) {
				categoriaBean = new CategoriaBean();
				categoriaBean.setId(categoria.getId());
				categoriaBean.setNome(categoria.getNome());
				categoriaBean.setComplemento(categoria.getComplemento());
			}

			CategoriaDAO categoriaDAO = new CategoriaDAO();
			List<Categoria> categorias = categoriaDAO.selectAll();
			CategoriaBeanList categoriaBeanList = new CategoriaBeanList(categorias);
			
			request.setAttribute("categoriaBean", categoriaBean);
			request.setAttribute("categoriaBeanList", categoriaBeanList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("jspPages/cadastraCategoria.jsp");
			dispatcher.forward(request, response);
		}

	}
}
