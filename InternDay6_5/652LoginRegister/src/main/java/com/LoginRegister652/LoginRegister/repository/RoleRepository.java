package com.LoginRegister652.LoginRegister.repository;

import com.LoginRegister652.LoginRegister.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

        Role findByName(String name);
}
