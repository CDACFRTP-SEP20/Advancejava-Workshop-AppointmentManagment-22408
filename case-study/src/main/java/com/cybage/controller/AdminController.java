package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import com.cybage.model.Users;
//import com.cybage.service.AdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cybage.model.Appointment;
import com.cybage.service.AdminService;




/*@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"admin"}
				)
		)*/
public class AdminController extends HttpServlet {
	 
	AdminService as=new AdminService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		if(path.equals("/admin-home")) {	
			
			
			try {
				List<Appointment> appointments;
				appointments = as.getAppointments();
				System.out.println(appointments);
				request.setAttribute("apntmnts", appointments);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("/admin/admin-home.jsp").forward(request, response);
		}
       if(path.equals("/deletappointment")) {	
			
    	   System.out.println("in delete appointments");
    	   try {
				System.out.println("deleted name::"+request.getParameter("username1"));
				as.deleteAppointment(request.getParameter("username1"));
				request.setAttribute("deletemsg", "User deleted successfully");
				response.sendRedirect("admin-home");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
