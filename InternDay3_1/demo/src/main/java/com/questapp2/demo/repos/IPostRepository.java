package com.questapp2.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp2.demo.entities.Post;

public interface IPostRepository extends JpaRepository<Post, Long>{

	List<Post> findByUserId(Long userId);
}
