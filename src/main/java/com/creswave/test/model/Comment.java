package com.creswave.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer commentId;

	private String content;

	private LocalDate date;

	private Integer commentByUserId;

	private String commentByUserName;

	@ManyToOne
	private Post post;

	@ManyToOne
	private User user;
}
