package com.BoxCase34.boxCase34.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BoxCase34.boxCase34.entities.Box;

@Repository
public interface IBoxRepository  extends JpaRepository<Box, Long>{

}
