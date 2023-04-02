package br.com.ienh.sisescola.ui.actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.dao.ContatoDAO;
import br.com.ienh.sisescola.entidades.Aluno;
import br.com.ienh.sisescola.entidades.Contato;
import br.com.ienh.sisescola.uteis.UserInput;

public class ContatoActions {
	
	private UserInput userInput;
	private AlunoDAO alunoDAO;
	private ContatoDAO contatoDAO;
	
	public ContatoActions() {
		
		try {
			userInput = new UserInput();
			contatoDAO = new ContatoDAO();
			alunoDAO = new AlunoDAO();
		} catch (Exception e) {
			System.out.println("Ocorreu algum problema no acesso a base de dados!");
		}
		
	}
	
	public void inserir() {
		
		try {
			
			int id = userInput.readInt("Informe o id do aluno que deseja adicionar contato:");
			Aluno aluno = alunoDAO.findById(id);
			
			if(aluno == null) {
				System.out.println("Aluno inexistente!");
			}else {
				Contato contato = new Contato();
				System.out.println("Informe os dados de um novo contato:");
				contato.setAluno(aluno);
				contato.setDescricao(userInput.readText("Descrição:"));
				contato.setTipo(userInput.readText("Tipo:"));
				contatoDAO.insert(contato);
				System.out.println("Contato registrado com sucesso!");
			}
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro ao tentar registrar o contato! Entre em contato com o administrador!");
			e.printStackTrace();
			
		}
		
	}

	public void remover() {
		
		try {
			
			int id = userInput.readInt("Informe o id do aluno que deseja remover contato:");
			Aluno aluno = alunoDAO.findById(id);
			
			if(aluno == null) {
				System.out.println("Aluno inexistente!");
			}else {
				List<Contato> contatos = aluno.getContatos();
				if(contatos.size() == 0) {
					System.out.println("Este aluno não possui contatos:");
				}else {
					System.out.println("Exibindo contatos do aluno:");
					for (Contato contato : contatos) {
						System.out.println(contato.getId() + " - " +
											contato.getDescricao() + " - " +
											contato.getTipo());
					}
					int idContato = userInput.readInt("Informe o id do contato que deseja remover:");
					Contato contato = contatoDAO.findById(idContato);
					contatoDAO.remove(contato);
					System.out.println("Contato removido com sucesso!");
				}
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro ao tentar registrar o contato! Entre em contato com o administrador!");
			e.printStackTrace();
			
		}
		
	}

	public void visualizarPorAluno() {
		
		try {
			
			int id = userInput.readInt("Informe o id do aluno que deseja ver contatos:");
			Aluno aluno = alunoDAO.findById(id);
			if(aluno == null) {
				System.out.println("Aluno não encontrado!");
			}else {
				List<Contato> contatos = aluno.getContatos();
				if(contatos.size() == 0) {
					System.out.println("Não há contatos para apresentar!");
				}else {
					for (Contato contato : contatos) {
						System.out.println(contato.getDescricao() + " - " + contato.getTipo());
					}
				}
			}
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro! Entre em contato com o administrador!");
			e.printStackTrace();
			
		}
		
	}

}
