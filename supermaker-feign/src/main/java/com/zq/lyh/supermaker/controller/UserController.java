package com.zq.lyh.supermaker.controller;

import com.zq.lyh.supermaker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return null;
    }

    }


