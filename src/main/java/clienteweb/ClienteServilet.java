package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*� NECESSARIO UTILIZAR A ANOTACAO "@WEBSERVLET" PARA QUE SE POSSA INDICAR AO SERVLET QUAL PAGINA DO WEBSERVICE QUE O MESMO IRA 
 * ATENDER QUANDO FOR REQUISITADO/SOLICITADO (PODE SER MAIS DE UMA PAGINA SIMULTANEAMENTE). 
 */
@WebServlet(urlPatterns = { "/cliente", "/clienteServlet", "/clienteController" })
/*
 * A CLASSE "CLIENTESERVILET" � UMA CLASSE JAVA CAPAZ DE ATENDER REQUISICOES
 * VINDAS DA WEB, POIS EXTENDEU A CLASSE "HTTPSERVLET"(HERAN�A).
 */
public class ClienteServilet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// SOBRESCREVENDO O METODO "DOGET".
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Chamou pelo m�todo GET");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//System.out.println("Chamou pelo m�todo POST");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("Chamou pelo m�todo POST!");
	}
}