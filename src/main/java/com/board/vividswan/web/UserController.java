package com.board.vividswan.web;

import com.board.vividswan.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {

    @PostMapping("/create")
    public String create(User user){
        return "index";
    }
}
