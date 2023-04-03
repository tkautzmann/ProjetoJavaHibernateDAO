package br.com.ienh.sisescola.ui.menus;

import br.com.ienh.sisescola.ui.actions.TurmaActions;
import br.com.ienh.sisescola.uteis.UserInput;

public class MenuTurma implements Menu {

	public void executar() {
		
		UserInput userInput = new UserInput();
		TurmaActions turmaActions = new TurmaActions();
		
		while (true) {
			
			System.out.println();
			System.out.println("TURMAS");
			System.out.println("1. Inserir");
			System.out.println("2. Atualizar");
			System.out.println("3. Remover");
			System.out.println("4. Buscar por id");
			System.out.println("5. Buscar todos");
			System.out.println("6. Vincular aluno a turma");
			System.out.println("7. Visualizar alunos da turma");
			System.out.println("---------------------");
			System.out.println("0. Sair deste menu");
			System.out.println();
					
			int option = userInput.readInt("Informe sua opção:");
			
			if(option == 1) turmaActions.inserir();
			else if(option == 2) turmaActions.atualizar();
			else if(option == 3) turmaActions.remover();
			else if(option == 4) turmaActions.buscarPorId();
			else if(option == 5) turmaActions.buscarTodos();
			else if(option == 6) turmaActions.vincularAluno();
			else if(option == 7) turmaActions.visualizarAlunosTurma();
			else if(option == 0) break;
			
		}
		
	}
	
}
