package br.com.ienh.sisescola.ui.actions;

import java.util.List;

import br.com.ienh.sisescola.dao.ProfessorDAO;
import br.com.ienh.sisescola.entidades.Professor;
import br.com.ienh.sisescola.uteis.UserInput;

public class ProfessorActions {

	private UserInput userInput;
	private ProfessorDAO professorDAO;
	
	public ProfessorActions() {
		userInput = new UserInput();
		
	}
	
	public void inserir() {
		
		try {
			
			Professor professor = new Professor();
			
			System.out.println("Informe os dados de um novo professor:");
			
			professor.setNome(userInput.readText("Nome:"));
			
			professorDAO.insert(professor);
			
			System.out.println("Professor registrado com sucesso!");
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro ao tentar registrar o professor! Entre em contato com o administrador!");
			e.printStackTrace();
			
		}
		
	}

	public void atualizar() {
		
	}

	public void remover() {
		
	}

	public void buscarPorId() {
		
	}
	
	public void buscarTodos() {
		
		try {	
			
			List<Professor> professores = professorDAO.findAll();
			if(professores.size() == 0) {
				System.out.println("Não há professores para visualizar!");
			}else {
				for (Professor professor : professores) {
					System.out.println(professor.getId() + " - " + professor.getNome());
				}
			}
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro ao tentar buscar os professores! Entre em contato com o administrador!");
			e.printStackTrace();
			
		}
		
	}
	
}
