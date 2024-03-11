package com.creswave.test.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageResponse {

    private LocalDateTime timestamp;

	private String fileName;

	private String message;

	private boolean status;
}
