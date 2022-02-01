package ec.edu.ups.pweb.servicioSoap.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pweb.servicioSoap.model.Automovil;

@Stateless
public class AutomovilDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Automovil a) {
		em.persist(a);
	}
	
	public void update(Automovil a) {
		em.merge(a);
	}
	
	public Automovil read(String placa) {
		Automovil a= em.find(Automovil.class, placa);
		return a;
	}
	
	
	public void delete(String marca) {
		Automovil a= em.find(Automovil.class, marca);
		em.remove(a);
	}
	public List<Automovil> getList(){
		List<Automovil> listado=new ArrayList<Automovil>();
		String jpql="SELECT a FROM Automovil a";
		Query query= em.createQuery(jpql,Automovil.class);
		listado = query.getResultList();
		return listado;
	}
}
