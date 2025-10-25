package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.Usuario;

/**
 * Servlet implementation class Usuarios
 */
@WebServlet("/Usuarios")
public class Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario("19201255-8","seba","herna", "78457878"));
		listaUsuarios.add(new Usuario("19202255-8","slel","tellett", "7845357878"));
		listaUsuarios.add(new Usuario("19203255-8","ratrhnsa","homsef", "784543878"));
		
		HttpSession session =request.getSession();
		session.setAttribute("listaUsuarios", listaUsuarios);
		
		//responder a la peticion
		response.sendRedirect("mostrar-usuario.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String lenguaje = request.getParameter("lenguaje");
		String[] intereses = request.getParameterValues("intereses");
		String perfil = request.getParameter("perfil");

		out.println("<html>"
				+ "<head> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\"></head>"
				+ "<body>");

		out.println("<div class='container mt-5'>");
		out.println("<h1>Bienvenido" + " " + nombre + " " + apellido + "</h1>");
		out.println("<h2>Tu perfil es:" + perfil + "</h2>");
		out.println("tu lenguaje de programacion favorito es:" + " " + lenguaje);
		out.println("<ul>");
		if (intereses != null) {
			for (String interes : intereses) {
				out.println("<li class='list-group-item'>" + interes + "</li>");
			}
		}
		;
		out.println("</ul>");
		out.println("</div>" + "</body>" + "</html>");

	}

}
