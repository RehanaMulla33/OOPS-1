package com.xworkz.OOPS;

import java.util.Date;

public class PassportSeva {
	int passport_No;
	String citizenship;
	String name;
	Character sex;
	Date date_of_issue;
	Date date_of_expiry;
	Date dob;

	public void latest_News() {
		System.out.println("Due to pandamic mantain social distance");
	}

	public void registartion() {
		System.out.println("Click here for new user registration");
	}

	public void ex_login() {
		System.out.println("Click here for exisisting  user login");
	}

	public void appointment() {
		System.out.println("Appointment is held on 23.09.2021");
	}

	public void status() {
		System.out.println("Application status-Verified at  first level");
	}

	public void recieve() {
		System.out.println(" your application has been  recieved and is in process..");
	}

	public void cancel() {
		System.out.println("Address proof has not been matching in police verification-Aplication canceled");
	}

}