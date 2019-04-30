package com.infotel.TpMavenSpringJpa.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringJpa.metier.Adresse;
import com.infotel.TpMavenSpringJpa.metier.Personne;
import com.infotel.TpMavenSpringJpa.service.Iservice;
import com.infotel.TpMavenSpringJpa.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Personne p = context.getBean("personne", Personne.class);
		//p.setNom("Toto");
		//p.setPrenom("Tata");

		Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
		//service.ajouterPersonne(p);
		//System.out.println(p);
		
		/*
		//Méthode modifier
		p = service.getPersonneAff(1);
		p.setNom("TARTAR");
		service.modifierPersonne(p);
		System.out.println(p);
		*/
		
		/*
		//Méthode supprimer
		p = service.getPersonneSuppr(2);
		service.supprimerPersonne(p);
		*/
		
		/*
		//Méthode lister
		Personne p = context.getBean("personne", Personne.class);
		p.setNom("Hulk");
		p.setPrenom("Cogan");
		p.setAge(35);
		service.ajouterPersonne(p);
		System.out.println(service.findAllPersonne());
		*/
		
		
		/*
		Adresse a1 = context.getBean("adresse", Adresse.class);
		a1.setNumRue(1);
		a1.setNomRue("Orsel");
		a1.setVille("Paris");
		a1.setCp(75000);
		service.ajouterAdresse(a1);
		Adresse a2 = context.getBean("adresse", Adresse.class);
		a2.setNumRue(3);
		a2.setNomRue("Damozanne");
		a2.setVille("Caen");
		a2.setCp(14000);
		service.ajouterAdresse(a2);
		
		Personne p1 = context.getBean("personne", Personne.class);
		p1.setNom("Pierre");
		p1.setPrenom("Jean");
		p1.setAge(35);
		service.ajouterPersonne(p1);
		Personne p2 = context.getBean("personne", Personne.class);
		p2.setNom("Cogan");
		p2.setPrenom("Hulk");
		p2.setAge(19);
		service.ajouterPersonne(p2);
		Personne p3 = context.getBean("personne", Personne.class);
		p3.setNom("Ultrech");
		p3.setPrenom("Sigvird");
		p3.setAge(95);
		service.ajouterPersonne(p3);
		*/
		
		Personne p = context.getBean("personne", Personne.class);
		Adresse a = context.getBean("adresse", Adresse.class);
		p = service.getPersonneAff(1);
		a = service.getAdresseAff(2);
		p.setAdresse(a);
		service.modifierPersonne(p);
		System.out.println(p);
	}
}
