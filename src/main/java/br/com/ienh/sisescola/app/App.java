package br.com.ienh.sisescola.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.entidades.Aluno;

public class App {

	public static void main(String[] args) {
		
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		try {
			AlunoDAO alunoDAO = new AlunoDAO();
			Aluno aluno = alunoDAO.findById(1);
			System.out.println(aluno.getNome());
		}catch(Exception e) {
			System.out.println("Houve um problema para realizar o operação!");
		}
		
	}

}
