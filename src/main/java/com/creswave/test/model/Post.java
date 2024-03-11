package com.creswave.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;

    private String title;

	private String contentLine1;

	private String contentLine2;

	private String image;

	private LocalDate date;

	@ManyToOne
	private User user;

	@ManyToOne
	private Category category;

	@OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<Comment>();


}
