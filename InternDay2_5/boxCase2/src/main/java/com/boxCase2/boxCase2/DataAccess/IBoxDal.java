package com.boxCase2.boxCase2.DataAccess;

import java.util.List;

import com.boxCase2.boxCase2.Entities.Kutu;


public interface IBoxDal {
	
	List<Kutu> getall();
	
	void add(Kutu kutu);
	void update(Kutu kutu);
	void delete(Kutu kutu);
	Kutu getById(int id);

}
