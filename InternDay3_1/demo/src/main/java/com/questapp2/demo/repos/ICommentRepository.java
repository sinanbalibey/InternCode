package com.questapp2.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp2.demo.entities.Comment;

public interface ICommentRepository extends JpaRepository<Comment, Long> {

}
