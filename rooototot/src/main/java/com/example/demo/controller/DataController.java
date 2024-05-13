package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DataController {

    @Autowired
    private UserService userService;


    @PostMapping("/v1/data")
    public User getDataByIdFromRequestBody(@RequestBody Map<String, Integer> requestBody) {
        int id = requestBody.get("id");
        return userService.getUser(id);
    }

}
