package com.creswave.test.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private String userId;

	private String name;

	private String email;

	private String about;

	private Set<RoleResponseDto> roles;

}
