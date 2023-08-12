package com.Login.Login.repository;

import com.Login.Login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
