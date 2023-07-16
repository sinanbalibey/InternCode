package com.boxCase2.boxCase2.DataAccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import com.boxCase2.boxCase2.Entities.Kutu;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;



@Repository
public class BoxManager implements IBoxDal {

	private EntityManager entityManager;
	
	@Autowired
	public BoxManager(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	@Override
	@Transactional
	public List<Kutu> getall() {

		Session session=entityManager.unwrap(Session.class);
		List<Kutu>  kutular=session.createQuery("from boxes",Kutu.class).getResultList();
		
		return kutular;
	}

	@Override
	public void add(Kutu kutu) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(kutu);
		
	}

	@Override
	public void update(Kutu kutu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Kutu kutu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kutu getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
