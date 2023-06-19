package modelado.com.Parcial.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import modelado.com.Parcial.entity.Persona;

@Repository
@Transactional
public class PersonaDaoImp implements IPersonaDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Persona> obtenerPersona() {

		String query = "FROM Persona";

		return entityManager.createQuery(query).getResultList();
	}
}
