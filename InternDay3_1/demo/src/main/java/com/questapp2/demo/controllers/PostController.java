package com.questapp2.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.questapp2.demo.entities.Post;
import com.questapp2.demo.request.PostCreateRequest;
import com.questapp2.demo.services.PostServices;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private PostServices postServices;

	public PostController(PostServices postServices) {
		this.postServices = postServices;
	}
	
	@GetMapping
	public List<Post> getAllPosts(@RequestParam Optional<Long> userId){
		
		return postServices.getAllPosts(userId);
	}
	
	@PostMapping
	public Post createOnePost(@RequestBody PostCreateRequest newPostRequest) {
		
		return postServices.createOnePost(newPostRequest);
	}
	
	@GetMapping("/{postId}")
	public Post getOnePost(@PathVariable Long postId) {
		
		return postServices.getOnePostById(postId);
	}

}
