package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cybage.controller.AdminController;
import com.cybage.model.Appointment;

public class AdminDao {
	public static final Logger logger = LogManager.getLogger(AdminDao.class.getName());
	public List<Appointment> getUsers() throws Exception{
		String sql = "select * from users";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Appointment> users = new ArrayList<Appointment>();
		while(rs.next()) {
			//users.add(new Users(rs.getString(1), rs.getString(2), rs.getString(3)));
		}
		logger.info("getting list of users from database");
		return users;
	}

	public int addUser(Appointment user) throws Exception {
		String sql = "insert into users values(?, ?, ?)";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);

		//ps.setString(1, user.getUsername());
		//ps.setString(2, user.getPassword());
		//ps.setString(3, user.getUserrole());

		logger.info("adding user in databse");
		return ps.executeUpdate();
	}

	public int deleteAppointments(String username) throws Exception{
		String sql = "delete from appointment where username = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		ps.setString(1, username);			
		logger.info("deleting user from database");
		return ps.executeUpdate();
	}

	public List<Appointment> getAppointments() throws Exception {
		
		String sql = "select * from appointment";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Appointment> appointments = new ArrayList<Appointment>();
		while(rs.next()) {
			//users.add(new Users(rs.getString(1), rs.getString(2), rs.getString(3)));
			appointments.add(new Appointment(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		}
		
		return appointments;
	}

	/*
	public int updateUser(Users user)  throws Exception{
		String sql = "update users set password = ? , userrole = ? where username = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		ps.setString(1, user.getPassword());
		ps.setString(2, user.getUserrole());
		ps.setString(3, user.getUsername());
		logger.info("updating  user from database : ");
		return ps.executeUpdate();
	}*/

}
