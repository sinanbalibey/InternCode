package com.questApps.questApps.responses;

import com.questApps.questApps.entites.Like;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikeResponse {

    Long id;

    Long userId;

    Long postId;

    public LikeResponse(Like entity){
        this.id= entity.getId();
        this.userId=entity.getUser().getId();
        this.postId=entity.getPost().getId();
    }
}
