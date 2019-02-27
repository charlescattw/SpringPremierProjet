package fr.cattieuw.ppspringboot.contoller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cattieuw.ppspringboot.contoller.IUtilisateurController;
import fr.cattieuw.ppspringboot.domaine.Utilisateur;
import fr.cattieuw.ppspringboot.service.impl.UtilisateurServiceImpl;

	@Controller
	public class UtilisateurControllerImpl implements IUtilisateurController { // dans cette classe il est question de lier le controller au service.

		@Autowired
		UtilisateurServiceImpl us ;

		@Override
		@RequestMapping("/Utilisateur")

		public String getUtilisateur(Model model) {

			ArrayList<Utilisateur> liste = us.getAllUsers();

			model.addAttribute("Utilisateur", liste);

			return "utilisateur_html";

	}
}
