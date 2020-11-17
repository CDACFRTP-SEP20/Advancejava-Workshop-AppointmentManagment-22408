package com.cybage.service;

import com.cybage.dao.AppointmentDao;
import com.cybage.model.Appointment;

public class AppointmentService {

	AppointmentDao appointmentDao=new AppointmentDao();
	public int registerComplaint(Appointment appointments) throws Exception {
		
		return appointmentDao.registerAppointment(appointments);
	}

}
