//package com.in28minutes.rest.webservices.user.service;
//
//import com.in28minutes.rest.webservices.post.Posts;
//import com.in28minutes.rest.webservices.user.entity.Users;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//@Component
//public class UserDaoService {
//    List<Users> list = new ArrayList<>();
//    private int count = 0;
//    public List<Users> getAllUsers (){
//        Users users1 = new Users(count++,"James", LocalDate.of(1980,10,10),
//                 new Posts(100,"new post",new Users()));
//        Users users2 = new Users(count++,"Andrew", LocalDate.of(1982,11,11));
//        Users users3 = new Users(count++,"Lisa", LocalDate.of(1984,12,12));
//        Users users4 = new Users(count++,"Hanna", LocalDate.of(1986,9,9));
//        list.add(users1);
//        list.add(users2);
//        list.add(users3);
//        list.add(users4);
//        return list;
//
//    }
//
//    public Users getUserById (Integer id) {
//        Predicate<Users> predicate = users-> users.getUserId().equals(id);
//        return list.stream().filter(predicate).findFirst().orElse(null);
//
//    }
//    public Users addUser (Users users){
//        users.setUserId(count++);
//        list.add(users);
//        return users;
//    }
//
//    public void deleteUser(Integer id) {
//        Predicate<Users> predicate = users -> users.getUserId().equals(id);
//        list.removeIf(predicate);
//         list.stream().filter(predicate).findFirst().orElse(null);
//    }
//}
