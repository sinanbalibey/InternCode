package com.questApps.questApps.controller;

import com.questApps.questApps.entites.Post;
import com.questApps.questApps.requests.PostCreateRequest;
import com.questApps.questApps.requests.PostUpdateRequest;
import com.questApps.questApps.responses.PostResponse;
import com.questApps.questApps.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostResponse> getAllPosts(@RequestParam Optional<Long> userId){
        return postService.getAllPosts(userId);
    }

    @PostMapping
    public Post createOnePost(@RequestBody PostCreateRequest newPostRequest){
        return postService.createOnePost(newPostRequest);
    }

    @GetMapping("/{postId}")
    public Post getOnePost(@PathVariable Long postId){
        return postService.getOnePostById(postId);
    }
    @PutMapping("/{postId}")
    public Post updateOnePost(@PathVariable Long postId,@RequestBody PostUpdateRequest postUpdateRequest){
        return postService.updateOneById(postId,postUpdateRequest);
    }

    @DeleteMapping("/{postId}")
    public void deleteOnePost(@PathVariable Long postId){
        postService.deleteOnePostById(postId);
    }
}
