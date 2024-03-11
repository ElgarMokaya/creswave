package com.creswave.test.RequestDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    @NotEmpty(message = "{User.name.invalid}")
    @NotNull(message = "{User.name.invalid}")
    @NotBlank(message = "{User.name.invalid}")

    @Size(min = 3, message = "User Name Should be Minimum of 3 Characters")
   private String name;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "{User.email.invalid}")
    private String email;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){6,12}$", message = "{User.password.invalid}")
    private String password;

    private String about;





}
