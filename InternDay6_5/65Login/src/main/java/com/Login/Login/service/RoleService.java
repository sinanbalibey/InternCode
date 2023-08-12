package com.Login.Login.service;
import com.Login.Login.entity.Role;
public interface RoleService {

    Role createRole(Role role);
    Role findByName(String name);
}
