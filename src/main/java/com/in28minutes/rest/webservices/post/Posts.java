package com.in28minutes.rest.webservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.user.entity.Users;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    //@Column(name="userID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Users users;
}
