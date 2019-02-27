package fr.cattieuw.ppspringboot.contoller;

import java.util.Map; // importe le model 

public interface IControllerHello {

	public String direHello(Map<String, Object> model); // équivalent de lservlet, elle est remplace ici par une methode.
														// pour une url une nouvelle méthode. ici renvoie une chaine de caractère.
	public String direTest(Map<String, Object> model);
	
	public String direSpring(Map<String, Object> model);
	
}
