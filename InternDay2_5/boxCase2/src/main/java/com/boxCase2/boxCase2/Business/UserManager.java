package com.boxCase2.boxCase2.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxCase2.boxCase2.DataAccess.IBoxDal;
import com.boxCase2.boxCase2.Entities.Kutu;

import jakarta.transaction.Transactional;

@Service
public class UserManager implements IUserManager {

	private IBoxDal boxDal;
	
	@Autowired
	public UserManager(IBoxDal boxDal) {
		this.boxDal=boxDal;
	}
	
	
	@Override
	@Transactional
	public List<Kutu> getall() {
		
		return this.boxDal.getall();
	}

	@Override
	@Transactional
	public void add(Kutu kutu) {

		this.boxDal.add(kutu);
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
