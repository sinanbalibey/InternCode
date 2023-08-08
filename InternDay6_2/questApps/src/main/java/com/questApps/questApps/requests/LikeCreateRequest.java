package com.questApps.questApps.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikeCreateRequest {

    Long id;

    Long userId;

    Long postId;
}
