package com.questapp2.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp2.demo.entities.Like;

public interface ILikeRepository extends JpaRepository<Like, Long>{

}
