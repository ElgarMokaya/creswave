package com.creswave.test.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponseDto {
    private Integer categoryId;

	private String categoryTitle;

	private String categoryDescription;


}
