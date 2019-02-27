package fr.cattieuw.ppspringboot.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.cattieuw.ppspringboot.domaine.Utilisateur;
import fr.cattieuw.ppspringboot.service.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {


	@Override

	public ArrayList<Utilisateur> getAllUsers() {

		ArrayList<Utilisateur> liste = new ArrayList<>();
		Utilisateur u1 = new Utilisateur("James", "H", 54);
		Utilisateur u2 = new Utilisateur("Jack", "K", 45);
		Utilisateur u3 = new Utilisateur("John", "S", 66);

		liste.add(u1);
		liste.add(u2);
		liste.add(u3);

		return liste;	}

	public Utilisateur getOne() {
		Utilisateur u = new Utilisateur("Thomas", "Cristaux", 88);
		return u;
	}



}
