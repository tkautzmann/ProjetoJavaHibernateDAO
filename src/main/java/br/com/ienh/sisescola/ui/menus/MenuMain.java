package br.com.ienh.sisescola.ui.menus;

import br.com.ienh.sisescola.uteis.UserInput;

public class MenuMain implements Menu {

	public void executar() {
		
		UserInput userInput = new UserInput();
		Menu selectedMenu = null;
		
		while (true) {
			
			System.out.println();
			System.out.println("Menu Principal:");
			System.out.println("1. Alunos");
			System.out.println("2. Professores");
			System.out.println("---------------------");
			System.out.println("0. Sair do programa");
			System.out.println();
					
			int option = userInput.readInt("Informe sua opção:");
			
			if(option == 1) selectedMenu = new MenuAluno();
			if(option == 2) selectedMenu = new MenuProfessor();
			else if(option == 0) break;
			
			selectedMenu.executar();
			
		}
		
		System.out.println();
		System.out.println("Saindo ...");
		System.out.println("Tchau!");
		System.out.println();
		
	}
	
}
