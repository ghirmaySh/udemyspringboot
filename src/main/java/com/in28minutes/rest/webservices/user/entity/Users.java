package com.in28minutes.rest.webservices.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.post.Posts;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_details")
public class Users {
    @Id
    @GeneratedValue
    //@Column(name = "id")
    private Integer id;
    @Size(min=2,message = "Name Should have atleast 2 characters")
    //@Column(name="name")
    private String name;
    @Past(message = "Birth date should be in the past")
    //@Column(name="birthday")
    private LocalDate birthday;
    @OneToMany(mappedBy = "users")
    @JsonIgnore
    private List<Posts> posts;
}

