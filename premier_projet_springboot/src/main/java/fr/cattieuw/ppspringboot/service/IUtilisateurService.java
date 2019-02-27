package fr.cattieuw.ppspringboot.service;

import java.util.ArrayList;

import fr.cattieuw.ppspringboot.domaine.Utilisateur;

public interface IUtilisateurService {
	
	
// le service est sollicité dans notre contexte en l'abscence d'un repository.
	
	public ArrayList<Utilisateur> getAllUsers();		

	public Utilisateur getOne(); 
}


