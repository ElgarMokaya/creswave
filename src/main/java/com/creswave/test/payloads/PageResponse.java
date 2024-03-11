package com.creswave.test.payloads;

import com.creswave.test.ResponseDto.PostResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse {

    private List<PostResponseDto> content;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalPages;

	private Long totalPosts;

	private boolean lastPage;
}
