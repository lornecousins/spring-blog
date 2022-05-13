package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roll-dice")
public class rolldiceController {

    @GetMapping
    public String numberGuess(){
        return "views-lecture/roll-dice";
    }
}
