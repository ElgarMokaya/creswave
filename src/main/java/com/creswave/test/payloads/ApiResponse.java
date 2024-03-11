package com.creswave.test.payloads;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ApiResponse {

    private LocalDateTime timestamp;

	private String message;

	private boolean status;
}
