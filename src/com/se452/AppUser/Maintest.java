package com.se452.AppUser;



public class Maintest {
	
	 public static void main(String[] args) throws Exception {
		  UserService us=new UserService();
		  
	us.addUser("Tutue2","xiyu332012@gmail.com", "F", "password",10);
	
	
	boolean ifValid=us.verifyExistingUser("Tutue2", "password");
	if(ifValid==true) System.out.print("Valid");
	else  System.out.print("Not Valid");
		 
		 
	us.uppdateExistingUserInformation("Tutue2", "password", "password1");
	  ifValid=us.verifyExistingUser("Tutue2", "password");
			if(ifValid==true) System.out.print("Valid");
			else  System.out.print("Not Valid");
			us.uppdateExistingUserInformation("Tutue2", "email", "xiyu@eclipseLink.com");
			us.uppdateExistingUserInformation("Tutue2", "gender", "M");
			us.uppdateExistingUserInformation("Tutue2", "age", "11");
			
			us.commitTransaction();
}
	 
}
