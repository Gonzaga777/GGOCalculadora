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
		int resultado = 0;
		if (request.getParameter("Somar") != null) {
			 resultado= c.somar();
		}else if (request.getParameter("Subtrair") != null) {
			 resultado = c.subtrair();
		}else if (request.getParameter("Multiplicar") != null) {
			 resultado = c.multiplicar();
		} else if (request.getParameter("Dividir") != null) {
			 resultado = c.Dividir();
		}
		
		
		request.setAttribute("res", resultado); // atribui a variavel "res" pra RESULT
		
		}
		
		request.getRequestDispatcher("/").forward(request, response); // 
	}
		
}

	

