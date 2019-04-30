package com.infotel.TpMavenSpringJpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringJpa.metier.Adresse;
import com.infotel.TpMavenSpringJpa.metier.Personne;

@Transactional
@Repository
public class DaoImpl implements Idao {
	@PersistenceContext
	EntityManager em;

	@Override
	public int ajouterPersonne(Personne p) {
		em.persist(p);
		return p.getIdPersonne();
	}

	@Override
	public Personne getPersonneSuppr(int idPersonne) {
		Personne p = em.getReference(Personne.class, idPersonne);
		return p;
	}

	@Override
	public Personne getPersonneAff(int idPersonne) {
		Personne p = em.find(Personne.class, idPersonne);
		return p;
	}

	@Override
	public int supprimerPersonne(Personne p) {
		em.remove(p);
		return 0;
	}

	@Override
	public int modifierPersonne(Personne p) {
		em.merge(p);
		return 0;
	}

	@Override
	public List<Personne> findAllPersonne() {
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();
		q = em.createQuery("SELECT p FROM Personne p");
		l = q.getResultList();
		
		return l;
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		em.persist(a);
		return a.getIdAdresse();
	}

	@Override
	public Adresse getAdresseSuppr(int idAdresse) {
		Adresse a = em.getReference(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public Adresse getAdresseAff(int idAdresse) {
		Adresse a = em.find(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		em.remove(a);
		return 0;
	}

	@Override
	public int modifierAdresse(Adresse a) {
		em.merge(a);
		return 0;
	}

	@Override
	public List<Adresse> findAllAdresse() {
		Query q = null;
		List<Adresse> l = new ArrayList<Adresse>();
		q = em.createQuery("SELECT a FROM Adresse p");
		l = q.getResultList();
		
		return l;
	}
	
	
	
	

}
