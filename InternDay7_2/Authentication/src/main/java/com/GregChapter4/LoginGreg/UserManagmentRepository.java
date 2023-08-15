package com.GregChapter4.LoginGreg;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagmentRepository extends JpaRepository<UserAccount,Long> {

}
