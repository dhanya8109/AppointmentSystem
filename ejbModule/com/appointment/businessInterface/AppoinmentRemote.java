package com.appointment.businessInterface;

import javax.ejb.Remote;

@Remote
public interface AppoinmentRemote {

	public String checkPerson(char _personName);

}
