package com.questapp2.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.questapp2.demo.entities.Post;
import com.questapp2.demo.entities.User;
import com.questapp2.demo.repos.IPostRepository;
import com.questapp2.demo.request.PostCreateRequest;

@Service
public class PostServices {

	private IPostRepository postRepository;
	private UserService userService;

	public PostServices(IPostRepository postRepository,UserService userService) {
		this.postRepository = postRepository;
		this.userService=userService;
	}

	public List<Post> getAllPosts(Optional<Long> userId) {
		
		if(userId.isPresent())
			return postRepository.findByUserId(userId.get());
		return postRepository.findAll();
	}

	public Post getOnePostById(Long postId) {
		return postRepository.findById(postId).orElse(null);
	}

	public Post createOnePost(PostCreateRequest newPostRequest) {
		User user=userService.getOneUser(newPostRequest.getUserId());
		
		if(user==null)
			return null;
		
		Post toSave=new Post();
		toSave.setId(newPostRequest.getId());
		toSave.setText(newPostRequest.getText());
		toSave.setTitle(newPostRequest.getTitle());
		toSave.setUser(user);
		
		return postRepository.save(toSave);
	}
	
	
}
