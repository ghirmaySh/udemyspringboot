package com.in28minutes.rest.webservices.user.repository;

import com.in28minutes.rest.webservices.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepository extends JpaRepository <Users,Integer> {

}
