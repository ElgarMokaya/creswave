package com.creswave.test.repository;

import com.creswave.test.model.Comment;
import com.creswave.test.model.Post;
import com.creswave.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {

    List<Comment> findByUser(User user);

	List<Comment> findByPost(Post post);


}
