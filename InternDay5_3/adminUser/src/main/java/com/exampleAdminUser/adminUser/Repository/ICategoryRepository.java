package com.exampleAdminUser.adminUser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleAdminUser.adminUser.Entity.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
