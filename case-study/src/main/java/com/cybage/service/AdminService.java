package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDao;
import com.cybage.model.Appointment;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	public List<Appointment> getUsers() throws Exception{
		return adminDao.getUsers();
	}
	/*
	public int addUser(Appointment user) throws Exception{
		return adminDao.addUser(user);
	}
	public int deleteUser(String username) throws Exception {
		 return adminDao.deleteUser(username);
	}
	public Users getUser(String username) throws Exception {
		return adminDao.getUser(username);
		
	}
	public int updateUser(Users user) throws Exception{
		return adminDao.updateUser(user);		
	}
*/
	public List<Appointment> getAppointments() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getAppointments();
	}
	public int deleteAppointment(String username) throws Exception {
		
		return adminDao.deleteAppointments(username);
	}
}
