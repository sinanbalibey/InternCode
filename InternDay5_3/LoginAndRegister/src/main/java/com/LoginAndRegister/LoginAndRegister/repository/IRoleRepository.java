package com.LoginAndRegister.LoginAndRegister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoginAndRegister.LoginAndRegister.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
