package com.creswave.test.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestDto {

    @NotNull(message = "{Post.title.invalid}")
	@NotBlank(message = "{Post.title.invalid}")
	@NotEmpty(message = "{Post.title.invalid}")
	private String title;

	@NotNull(message = "{Post.content.invalid}")
	@NotBlank(message = "{Post.content.invalid}")
	@NotEmpty(message = "{Post.content.invalid}")
	@Column(length = Integer.MAX_VALUE)
	private String contentLine1;

	@NotNull(message = "{Post.content.invalid}")
	@NotBlank(message = "{Post.content.invalid}")
	@NotEmpty(message = "{Post.content.invalid}")
	@Column(length = Integer.MAX_VALUE)
	private String contentLine2;
}
