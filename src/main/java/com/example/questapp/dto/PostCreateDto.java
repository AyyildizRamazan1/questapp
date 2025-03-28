package com.example.questapp.dto;

import lombok.Data;

@Data
public class PostCreateDto {

    Long id;
    String text;
    String title;
    Long userId;
}
