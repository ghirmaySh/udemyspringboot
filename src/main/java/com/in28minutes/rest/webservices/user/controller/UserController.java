package com.in28minutes.rest.webservices.user.controller;

import com.in28minutes.rest.webservices.post.Posts;
import com.in28minutes.rest.webservices.user.repository.UserRepository;
//import com.in28minutes.rest.webservices.user.repository.userRepository;
//import com.in28minutes.rest.webservices.user.service.UserDaoService;
import com.in28minutes.rest.webservices.user.UserNotfoundException;
import com.in28minutes.rest.webservices.user.entity.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

//Rest API
@RestController
//@RequestMapping("/Hello")
public class UserController {
    @Autowired
    //UserDaoService userDaoService;

    //@Autowired
    UserRepository userRepository;


    @GetMapping("/users")
    public List getUsers(){

        
        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public Optional<Users> getUserById(@PathVariable Integer id){
        //Users users =  userDaoService.getUserById(id);
        Optional<Users> users= userRepository.findById(id);
        if(users.isEmpty()){
            throw new UserNotfoundException("User with id " + id + " not found");
        }


        return users;
    }

    @PostMapping("/users")
    public ResponseEntity<Users> addUser (@Valid @RequestBody Users users){
        Users user = userRepository.save(users);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser (@PathVariable Integer id){

        userRepository.deleteById(id);
    }
}
