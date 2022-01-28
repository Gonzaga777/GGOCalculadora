package br.com.rd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
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
		//doGet(request, response);
		if ((request.getParameter("val1") != null) && (request.getParameter("val2") != null)){
		
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
		// int result = val1 + val2 ;
		
		
		//response.getWriter().println(" "+  "Resultado :"+ result);
		
		// chamada da regra de negócio
		Calc c = new Calc(val1 , val2);
		int resultado = c.somar();
		int resultado2 = c.subtrair();
		int resultado3 = c.multiplicar();
		int resultado4 = c.Dividir();

	
		
		
		request.setAttribute("res", resultado); // atribui a variavel "res" pra RESULT
		request.setAttribute("res2", resultado2);
		request.setAttribute("res3", resultado3);
		request.setAttribute("res4", resultado4);
		}
		
		request.getRequestDispatcher("/").forward(request, response); // 
	}
		
}

	

