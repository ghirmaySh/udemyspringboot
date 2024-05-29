package com.in28minutes.rest.webservices.post.repository;

import com.in28minutes.rest.webservices.post.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Posts,Integer> {
}
