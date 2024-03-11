package com.creswave.test.repository;

import com.creswave.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
        Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);

	List<User> findByNameContaining(String keyword);



}
