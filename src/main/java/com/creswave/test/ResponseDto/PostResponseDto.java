package com.creswave.test.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {

    private Integer postId;

	private String title;

	private String contentLine1;

	private String contentLine2;

	private String image;

	private LocalDate date;

	private CategoryResponseDto category;

	private UserResponseDto user;

	private                                                                                                                                                                                                 List<CommentResponseDto> comments;
}
