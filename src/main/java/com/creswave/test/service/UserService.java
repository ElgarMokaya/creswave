package com.creswave.test.service;

import com.creswave.test.RequestDto.UserRequestDto;
import com.creswave.test.RequestDto.UserUpdateRequestDto;
import com.creswave.test.ResponseDto.UserResponseDto;
import com.creswave.test.exceptions.ResourceNotFoundException;
import com.creswave.test.payloads.ApiResponse;

import java.util.List;

public interface UserService {
    UserResponseDto registerUser(UserRequestDto userdto) throws ResourceNotFoundException;

	UserResponseDto updateUser(UserUpdateRequestDto userdto, Integer userId) throws ResourceNotFoundException;

	UserResponseDto getUserById(Integer userId) throws ResourceNotFoundException;

	List<UserResponseDto> getAllUsers();

	ApiResponse deleteUserById(Integer userId) throws ResourceNotFoundException;

	UserResponseDto registerAdmin(UserRequestDto userdto) throws ResourceNotFoundException;

	List<UserResponseDto> searchUserByName(String keyword) throws ResourceNotFoundException;


}
