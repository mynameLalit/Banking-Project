package com.banking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banking.customer.Customer;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	/*Customer customer = new Customer();
	customer.setUsername(request.getParameter("username"));
	customer.setPassword(request.getParameter("password"));
	customer.setFirstname(request.getParameter("firstname"));
	customer.setLastname(request.getParameter("lastname"));
	
		customer.
	*/
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String errorMsg = null;
		
		if(username ==null || username.equals("")) {
			errorMsg = "Username can't be null or empty";
		}
		
		if(password == null || password.equals("")) {
			errorMsg = "Password can't be null or empty";
		}
		
		if(firstname == null || firstname.equals("")) {
			errorMsg = "Firstname can't be null or empty";
		}
		
		if(lastname == null || lastname.equals("")) {
			errorMsg = "Lastname can't be null or empty";
		}
	}

}
