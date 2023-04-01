package br.com.ienh.sisescola.app;

import java.net.ConnectException;
import java.time.LocalDate;
import java.util.List;

import br.com.ienh.sisescola.dao.AlunoDAO;
import br.com.ienh.sisescola.dao.ContatoDAO;
import br.com.ienh.sisescola.entidades.Aluno;
import br.com.ienh.sisescola.entidades.Contato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {

	public static void main(String[] args) {
		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SisEscola");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			ContatoDAO contatoDAO;
			contatoDAO = new ContatoDAO();
			for (Contato contato : contatoDAO.obterContatosEmail()) {
				System.out.println(contato.getDescricao());
			}
		} catch (Exception e) {
			System.out.println("Houve um problema para realizar o operação!");
		}
//		Aluno aluno = alunoDAO.findById(1);
//		System.out.println(aluno.getNome());
		
//		for (Contato contato : aluno.getContatos()) {
//			System.out.println(contato.getDescricao());
//		}
		
		// ENCONTRAR
//		Aluno aluno = entityManager.find(Aluno.class, 1);
//		System.out.println(aluno.getNome());
//		
//		List<Contato> contatos = aluno.getContatos();
//		
//		for (Contato contato : contatos) {
//			System.out.println(contato.getDescricao());
//		}
		
		//INSERIR
//		Aluno novoAluno = new Aluno();
//		novoAluno.setNome("Marisa");
//		novoAluno.setCpf("99827365423");
//		novoAluno.setNumeroMatricula("11827");
//		novoAluno.setNascimento(LocalDate.of(2004, 2, 25));
//		novoAluno.setEndereco("Rua das Limonadas, 161");
//		
//		Contato contato1 = new Contato();
//		contato1.setAluno(novoAluno);
//		contato1.setDescricao("marisa@gmail.com");
//		contato1.setTipo("email");
//		
//		Contato contato2 = new Contato();
//		contato2.setAluno(novoAluno);
//		contato2.setDescricao("30378625");
//		contato2.setTipo("telefone");
//		
//		novoAluno.getContatos().add(contato1);
//		novoAluno.getContatos().add(contato2);
//		
//		alunoDAO.insert(novoAluno);
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(novoAluno);
//		entityManager.getTransaction().commit();
		
		//CONSULTA
		
//		String consulta = "from Aluno";
//		Query query = entityManager.createQuery(consulta);
//		
//		List<Aluno> alunos = query.getResultList();
//		
//		for (Aluno aluno : alunos) {
//			System.out.println(aluno.getNome());
//		}
		
		//DELETAR	
//		Aluno aluno = entityManager.find(Aluno.class, 3);
//		
//		entityManager.getTransaction().begin();
//		entityManager.remove(aluno);
//		entityManager.getTransaction().commit();
		
	}

}
