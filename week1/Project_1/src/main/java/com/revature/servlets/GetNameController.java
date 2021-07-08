package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.customer.Customer;
import com.revature.customer.CustomerDaoImplement;

/**
 * Servlet implementation class GetNameController
 */
public class GetNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetNameController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int aid = Integer.parseInt(request.getParameter("customer_id"));
		
		CustomerDaoImplement cDao = new CustomerDaoImplement();
	//	Customer c1 = cDao.getCustomerEx(aid);
		Customer c1 = cDao.findById(aid);
		
	     request.setAttribute("mike", c1);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowCustomer.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
