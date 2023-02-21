package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/favColor")
    public String getMyFav(@RequestBody String yourFavColor) {
        return "My Favourite color is " + yourFavColor;
    }
}
