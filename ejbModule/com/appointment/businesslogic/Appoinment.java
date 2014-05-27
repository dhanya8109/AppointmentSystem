package com.appointment.businesslogic;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.appointment.businessInterface.AppoinmentRemote;

/**
 * Session Bean implementation class Appoinment
 */
@Stateless
@LocalBean
public class Appoinment implements AppoinmentRemote {
	String email;

	/**
	 * Default constructor.
	 */
	public Appoinment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String checkPerson(char _personName) {
		// TODO Auto-generated method stub
		System.out.println("Person verified");
		email.equals("persons email");
		return email;
	}
}
