package br.com.ienh.sisescola.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.ienh.sisescola.ui.UserInterface;

public class App {

	public static void main(String[] args) {
		
		//Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		UserInterface.run();
		
	}

}
