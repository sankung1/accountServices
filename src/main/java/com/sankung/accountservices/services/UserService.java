package com.sankung.accountservices.services;

import com.sankung.accountservices.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(new User("Sankung", "Sillah", "sillah@acme.com", "tops18rvdqv2"));
    }
}
