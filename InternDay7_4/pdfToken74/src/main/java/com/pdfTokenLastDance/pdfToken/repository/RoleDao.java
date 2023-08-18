package com.pdfTokenLastDance.pdfToken.repository;

import com.pdfTokenLastDance.pdfToken.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);
}
