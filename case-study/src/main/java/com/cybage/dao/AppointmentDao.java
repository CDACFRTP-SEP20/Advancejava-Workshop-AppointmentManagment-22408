package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.Appointment;
import com.cybage.dao.DbUtil;

public class AppointmentDao {

	public int registerAppointment(Appointment appointments) throws Exception
	{
System.out.println("into addhead");
		
		String sql = "insert into complaint (description,userremark,status,deptid,headremark,userId) values(?, ?, ?, ?,?,?)";
		System.out.println(sql);
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		
		//ps.setString(1,);
		//ps.setString(2, complaint.getUserRemark());
		
		
		return ps.executeUpdate();
	}
}
