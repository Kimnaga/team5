package com.se452.Friendship;

public class MainFriendshipTest {

	public static void main(String[] args) {
		FriendshipService fss=new FriendshipService();
		fss.addFriendship(100, 98, "10/02/2015 10:49:20");
		fss.addFriendship(98, 100, "10/02/2015 10:49:20");
		fss.addFriendship(100, 99, "10/02/2015 10:49:21");
		fss.addFriendship(99, 100, "10/02/2015 10:49:20");
		fss.addFriendship(100, 101, "10/02/2015 10:49:20");
		fss.addFriendship(101, 100, "10/02/2015 10:49:20");
		fss.commitTransaction();
		

	}

}
