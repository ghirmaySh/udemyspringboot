package com.in28minutes.rest.webservices.post.controller;

import com.in28minutes.rest.webservices.post.Posts;
import com.in28minutes.rest.webservices.post.repository.PostRepository;
import com.in28minutes.rest.webservices.user.UserNotfoundException;
import com.in28minutes.rest.webservices.user.entity.Users;
import com.in28minutes.rest.webservices.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
@RestController
public class PostController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PostRepository postRepository;
    @GetMapping("/users/{id}/posts")
    public List<Posts> getUserPostBuId(@PathVariable Integer id){
        Optional<Users> users = userRepository.findById(id);
        if(users.isEmpty()){
            throw new UserNotfoundException("User with id "+ id + "not found");

        }
        return users.get().getPosts();
    }
    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Object> createPosts (@PathVariable int id , @RequestBody Posts post){
        Optional<Users> users = userRepository.findById(id);
        if(users.isEmpty()){
            throw new UserNotfoundException("Post for the user" + id + "isn't available");
        }
        post.setUsers(users.get());
           postRepository.save(post);

          // URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                 //  .path("").
           return new ResponseEntity<>(201, HttpStatus.CREATED);
    }
}
