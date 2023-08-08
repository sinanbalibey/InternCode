package com.questApps.questApps.service;


import com.questApps.questApps.entites.Like;
import com.questApps.questApps.entites.Post;
import com.questApps.questApps.entites.User;
import com.questApps.questApps.repos.LikeRepository;
import com.questApps.questApps.requests.LikeCreateRequest;
import com.questApps.questApps.responses.LikeResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LikeService {
    private LikeRepository likeRepository;

    private UserService userService;

    private PostService postService;

    public LikeService(LikeRepository likeRepository, UserService userService, PostService postService) {
        this.likeRepository = likeRepository;
        this.userService = userService;
        this.postService = postService;
    }

    public List<LikeResponse> getAllLikesWithParam(Optional<Long> userId, Optional<Long> postId) {
        List<Like> list;
        if(userId.isPresent() && postId.isPresent()) {
            list = likeRepository.findByUserIdAndPostId(userId.get(), postId.get());
        }else if(userId.isPresent()) {
            list = likeRepository.findByUserId(userId.get());
        }else if(postId.isPresent()) {
            list = likeRepository.findByPostId(postId.get());
        }else
            list = likeRepository.findAll();
        return list.stream().map(like -> new LikeResponse(like)).collect(Collectors.toList());
    }

    public Like getOneLikeById(Long LikeId){
        return likeRepository.findById(LikeId).orElse(null);
    }


    public Like createOneLike(LikeCreateRequest request){
        User user=userService.getOneUserById(request.getUserId());
        Post post=postService.getOnePostById(request.getPostId());

        if(user!=null&post!=null){
            Like likeToSave=new Like();
            likeToSave.setId(request.getId());
            likeToSave.setPost(post);
            likeToSave.setUser(user);

            return likeRepository.save(likeToSave);
        }
        else
            return null;
    }
    public void deleteOneLikeById(Long likeId){
        likeRepository.deleteById(likeId);
    }
}
