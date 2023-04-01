package br.com.ienh.sisescola.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.entidades.Aluno;
import br.com.ienh.sisescola.entidades.Contato;
import br.com.ienh.sisescola.entidades.Responsavel;
import br.com.ienh.sisescola.entidades.Turma;

public class App {

	public static void main(String[] args) {
		
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		testesComAluno();
		
	}

	private static void testesComAluno() {
		try {
			AlunoDAO alunoDAO = new AlunoDAO();
			System.out.println("Obtendo aluno por id");
			Aluno aluno = alunoDAO.findById(3);
			System.out.println(aluno.getNome());
			System.out.println("Obtendo contatos do aluno");
			for (Contato contato : aluno.getContatos()) {
				System.out.println(contato.getDescricao());
			}
			System.out.println("Obtendo turmas do aluno");
			for (Turma turma : aluno.getTurmas()) {
				System.out.println(turma.getSemestre());
			}
			System.out.println("Obtendo responsáveis do aluno");
			for (Responsavel responsavel : aluno.getResponsaveis()) {
				System.out.println(responsavel.getNome());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
