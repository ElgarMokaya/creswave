package com.creswave.test.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponseDto {
    private Integer commentId;

	private Integer commentByUserId;

	private String commentByUserName;

	private String content;

	private LocalDate date;

}
