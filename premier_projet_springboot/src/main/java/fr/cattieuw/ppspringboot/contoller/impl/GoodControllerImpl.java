package fr.cattieuw.ppspringboot.contoller.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cattieuw.ppspringboot.contoller.IGoodController;

@Controller
public class GoodControllerImpl implements IGoodController {


	@Override
	@RequestMapping("/Salutations")

	public String Salutations(Model model) {

		String nom ="Jack J";
		model.addAttribute("nom", nom);

		int nombre = 100;
		model.addAttribute("nombre", nombre);

		boolean b = false;
		model.addAttribute("bool", b);

		return "SalutationPages";

	}

	@RequestMapping("/boucles")
	public String boucles(Model model) {
		
		ArrayList<String> noms = new ArrayList<>();
		noms.add("James");
		noms.add("Jack");
		noms.add("Thomas");
		noms.add("Eric");
		
		return "SalutationPages";
	}

}