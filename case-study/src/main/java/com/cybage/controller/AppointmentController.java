package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Appointment;
import com.cybage.service.AppointmentService;


/**
 * Servlet implementation class AppointmentController
 */
public class AppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public AppointmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		
		AppointmentService as=new AppointmentService();
		if(path.equals("/registercomplaint")) {			
			try {
				
				//Complaint complaint = new Complaint();
				Appointment appointments=new Appointment();
				appointments.setUsername(request.getParameter("username"));
				appointments.setAppointmentdate(request.getParameter(""));
				appointments.setAppointmenttime(request.getParameter(""));
				appointments.setDescription(request.getParameter(""));
				appointments.setAddress(request.getParameter(""));
				as.registerComplaint(appointments);
				request.getRequestDispatcher("/citizen/citizen-home.jsp").forward(request, response);
				//response.sendRedirect("/citizen-home.jsp");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
