package com.Loginandregister2.loginregister2.repository;

import com.Loginandregister2.loginregister2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
