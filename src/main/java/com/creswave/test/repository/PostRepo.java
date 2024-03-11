package com.creswave.test.repository;

import com.creswave.test.model.Category;
import com.creswave.test.model.Post;
import com.creswave.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

	// Searching By Title
	List<Post> findByTitleContaining(String title);

}
