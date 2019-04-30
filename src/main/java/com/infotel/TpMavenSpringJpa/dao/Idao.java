package com.infotel.TpMavenSpringJpa.dao;

import java.util.List;

import com.infotel.TpMavenSpringJpa.metier.Adresse;
import com.infotel.TpMavenSpringJpa.metier.Personne;

public interface Idao {
	
	public int ajouterPersonne(Personne p);
	public Personne getPersonneSuppr(int idPersonne);
	public Personne getPersonneAff(int idPersonne);
	public int supprimerPersonne(Personne p);
	public int modifierPersonne(Personne p);
	public List<Personne> findAllPersonne();
	
	public int ajouterAdresse(Adresse a);
	public Adresse getAdresseSuppr(int idAdresse);
	public Adresse getAdresseAff(int idAdresse);
	public int supprimerAdresse(Adresse a);
	public int modifierAdresse(Adresse a);
	public List<Adresse> findAllAdresse();
	
	
	
	

}
