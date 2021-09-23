package com.xworkz.OOPS;

import java.util.Date;

public class PharmEasy {
	String medicine_name;
	String lab_name;
	int lic_no;
	Date mfg_date;
	Date expiry_date;
	int pincode;
	int phonr_no;
	String password;

	public void login() {
		System.out.println("enter phone_no to login");
	}

	public void order_medicine() {
		System.out.println("Enter medicine name");
	}

	public void healthcare_products() {
		System.out.println("select pincode to check best price");
	}

	public void lab_test() {
		System.out.println("Diabiteic care package-available at 500 Rs->plz select");
	}

	public void baby_food() {
		System.out.println("Nesle nan-Add to cart");
	}

	public void skin_care() {
		System.out.println("");
	}

	public void nutrition() {
		System.out.println(" Nutrition wellness-up to 60% off");
	}

	public void deliver() {
		System.out.println("select pincode to deliver");
	}

}