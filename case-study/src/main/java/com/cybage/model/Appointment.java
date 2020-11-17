package com.cybage.model;

public class Appointment {

	String username;
	String appointmentdate;
	String appointmenttime;
	String description;
	String address;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(String username, String appointmentdate, String appointmenttime, String description,
			String address) {
		super();
		this.username = username;
		this.appointmentdate = appointmentdate;
		this.appointmenttime = appointmenttime;
		this.description = description;
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getAppointmenttime() {
		return appointmenttime;
	}
	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Appointment [username=" + username + ", appointmentdate=" + appointmentdate + ", appointmenttime="
				+ appointmenttime + ", description=" + description + ", address=" + address + "]";
	}
	
	
}
