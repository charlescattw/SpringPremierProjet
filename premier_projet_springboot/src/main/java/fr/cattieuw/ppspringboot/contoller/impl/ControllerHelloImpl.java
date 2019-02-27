package fr.cattieuw.ppspringboot.contoller.impl;

import java.util.Map;

import org.springframework.stereotype.Controller; // importe le controller pour l'annotation de la classe COntroller Hello
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cattieuw.ppspringboot.contoller.IControllerHello;

@Controller //implémente la classe ControllerHello dans le package Controller
public class ControllerHelloImpl implements IControllerHello {

	@RequestMapping("/hello")
	public String direHello(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "hello"; //appel la page html du même nom.
	}

	@RequestMapping("/helloSans")
	public String direTest(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "testPasHello"; //appel la page html du même nom.
	}

	@RequestMapping("/spring")
	public String direSpring(Map<String, Object> model) {
		String valeur = "Spring Framework";
		model.put("titre", valeur);
		String nbs ="1234569";
		model.put("cle", nbs);
		return "springPage"; //appel la page html du même nom.
	}
	
	@RequestMapping("/controler")
	public String direController(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "testController"; //appel la page html du même nom.
	}

}
