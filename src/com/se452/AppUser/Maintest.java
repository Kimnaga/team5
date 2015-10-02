package com.se452.AppUser;

public class Maintest {

	public static void main(String[] args) throws Exception {
		
		UserService us = new UserService();

		us.addUser("Rey", "rey@gmail.com", "M", "passwordRey", 28);
		us.addUser("Rebecca", "Rebecca@gmail.com", "F", "passwordRebecca", 24);
		us.addUser("Emma", "Emma@gmail.com", "F", "passwordEmma", 25);
		us.addUser("Naga", "Naga2gail.com", "M", "passwordNage", 26);
		
		us.commitTransaction();
	}

}
