package br.com.ienh.sisescola.ui;

import br.com.ienh.sisescola.ui.menus.MenuMain;

public class UserInterface {

	public static void run() {
		
		String[] logoAscii = {
				"",
				"       / \\__",
	            "     (       @\\___",
	            "     /             O",
	            "    /       (_____/",
	            "   /_____ /   U",
	            "",   
	            "       SISESCOLA",
	            "",
	            "     Seja bem-vindo!",
	            ""
		};

        for (String linha : logoAscii)
            System.out.println(linha);
        
        new MenuMain().executar();
		
	}
	
}
