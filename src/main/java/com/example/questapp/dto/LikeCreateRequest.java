package com.example.questapp.dto;

import lombok.Data;

@Data
public class LikeCreateRequest {

    Long id;
    Long userId;
    Long postId;
}
