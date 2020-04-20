package com.spring.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);

}
