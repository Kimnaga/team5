package com.se452.UMUURequest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.se452.AppUser.AppUser;
import com.se452.Profile.Profile;


public class TestUMUURequest {

	public static void main(String[] args) {	 EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("SE452EclipseLink2");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 	entityManager.getTransaction().begin();
		 	List resultNaga = entityManager.createQuery("select au from AppUser au where au.appUserName=:userName")
			          .setParameter("userName", "Naga").getResultList();
			AppUser appNaga=(AppUser) resultNaga.get(0);
			List resultEmma = entityManager.createQuery("select au from AppUser au where au.appUserName=:userName")
			          .setParameter("userName", "Emma").getResultList();
		 	AppUser appEmma=(AppUser) resultEmma.get(0);
		 	List resultRebecca = entityManager.createQuery("select au from AppUser au where au.appUserName=:userName")
			          .setParameter("userName", "Rebecca").getResultList();
		 	AppUser appRebecca=(AppUser) resultRebecca.get(0);
		 
		 	
		 	UMUURequest ur=new UMUURequest();
		 	ur.setMatchMaker(appEmma);
		 	ur.setRequestUser(appNaga);
		 	ur.setReceiveRequestUser(appRebecca);
		 	ur.setRequestSendTime("10/03/2015 10:49:20");
		 	entityManager.persist(ur);
		 	entityManager.getTransaction().commit();
		     entityManager.close();
		     entityManagerFactory.close();
		 	

	}

}
