package com.boxCase3_2.boxCase3_2.repostoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxCase3_2.boxCase3_2.entities.Users;

public interface IUserRepository  extends JpaRepository<Users, Long>{

}
