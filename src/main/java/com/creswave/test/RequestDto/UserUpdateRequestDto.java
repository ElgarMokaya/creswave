package com.creswave.test.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequestDto {

    @NotEmpty(message = "{User.name.invalid}")
	@NotNull(message = "{User.name.invalid}")
	@NotBlank(message = "{User.name.invalid}")
	@Size(min = 3, message = "User Name Should be Minimum of 3 Characters")
	private String name;

	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){6,12}$", message = "{User.password.invalid}")
	private String password;

	private String about;

}
