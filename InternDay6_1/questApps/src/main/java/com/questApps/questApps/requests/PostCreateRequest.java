package com.questApps.questApps.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PostCreateRequest {

    Long id;
    String text;
    String title;
    Long userId;
}
