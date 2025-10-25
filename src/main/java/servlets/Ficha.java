package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ficha
 */
@WebServlet("/Ficha")
public class Ficha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ficha() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//respuesta
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String lenguaje = request.getParameter("lenguaje");
		String [] intereses = request.getParameterValues("intereses");
		String perfil = request.getParameter("perfil");
		
		
		out.println("<html>"+"<head> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\"></head>"
		+"<body>");
		
		out.println("<div class='container mt-5'>");
		out.println("<h1>Bienvenido"+" "+nombre+" "+apellido+"</h1>");
		out.println("<h2>Tu perfil es:"+perfil+"</h2>");
		out.println("tu lenguaje de programacion favorito es:"+" "+lenguaje);
		out.println("<ul>");
		if(intereses!=null) {
			for(String interes: intereses) {
				out.println("<li class='list-group-item'>"+interes+"</li>");
			}			
		};
		out.println("</ul>");		
		out.println("</div>"+"</body>"+"</html>");
						
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
