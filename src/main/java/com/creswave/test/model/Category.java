package com.creswave.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

	private String categoryTitle;

	private String categoryDescription;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Post> listOfPosts = new ArrayList<>();


}
