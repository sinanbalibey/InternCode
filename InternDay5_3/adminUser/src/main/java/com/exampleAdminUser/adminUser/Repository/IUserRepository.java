package com.exampleAdminUser.adminUser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleAdminUser.adminUser.Entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	
	User checkUserAndPassword(String username,String password);
}
