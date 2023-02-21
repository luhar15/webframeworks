package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/name")
    public String getName(@RequestBody String studentName) {
        return "Welcome " + studentName + "!";
    }
}