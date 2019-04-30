package com.infotel.TpMavenSpringJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringJpa.dao.Idao;
import com.infotel.TpMavenSpringJpa.metier.Adresse;
import com.infotel.TpMavenSpringJpa.metier.Personne;

@Service
public class ServiceImpl implements Iservice {
	
	@Autowired
	private Idao dao;

	@Override
	public int ajouterPersonne(Personne p) {
		
		return dao.ajouterPersonne(p);
	}
	
	
	

	@Override
	public Personne getPersonneSuppr(int idPersonne) {
		
		return dao.getPersonneSuppr(idPersonne);
	}




	@Override
	public Personne getPersonneAff(int idPersonne) {
		
		return dao.getPersonneAff(idPersonne);
	}




	@Override
	public int supprimerPersonne(Personne p) {
		
		return dao.supprimerPersonne(p);
	}




	@Override
	public int modifierPersonne(Personne p) {
		
		return dao.modifierPersonne(p);
	}




	@Override
	public List<Personne> findAllPersonne() {
		
		return dao.findAllPersonne();
	}




	@Override
	public int ajouterAdresse(Adresse a) {
		
		return dao.ajouterAdresse(a);
	}




	@Override
	public Adresse getAdresseSuppr(int idAdresse) {
		
		return dao.getAdresseSuppr(idAdresse);
	}




	@Override
	public Adresse getAdresseAff(int idAdresse) {
		
		return dao.getAdresseAff(idAdresse);
	}




	@Override
	public int supprimerAdresse(Adresse a) {
		
		return dao.supprimerAdresse(a);
	}




	@Override
	public int modifierAdresse(Adresse a) {
		
		return dao.modifierAdresse(a);
	}




	@Override
	public List<Adresse> findAllAdresse() {
		
		return dao.findAllAdresse();
	}




	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}
	
	

}
