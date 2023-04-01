package br.com.ienh.sisescola.dao;

import java.util.List;

import br.com.ienh.sisescola.database.ConnectionDatabase;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

//aplicação do padrão DAO
public class DAOGenerics <T, U> implements DAO<T, U> {
	
	private ConnectionDatabase connection;
	private EntityManager entityManager;
	private Class<T> entityType;
	
	public DAOGenerics(Class<T> persistedClass) throws Exception{
		connection = ConnectionDatabase.getConnection();
		entityManager = connection.getEntityManager();
		this.entityType = persistedClass;
	}

	public T findById(U id) throws Exception{
		T obj = connection.getEntityManager().find(entityType, id);
		return obj;
	}

	public List<T> findAll() throws Exception{
		String consulta = "from Aluno";
		Query query = entityManager.createQuery(consulta);
		return query.getResultList();
	}

	public void insert(T obj) throws Exception{
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}

	public void update(T obj) throws Exception{
		entityManager.getTransaction().begin();
		entityManager.merge(obj);
		entityManager.getTransaction().commit();
	}

	public void remove(T obj) throws Exception{
		entityManager.getTransaction().begin();
		entityManager.remove(obj);
		entityManager.getTransaction().commit();
	}
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
}
