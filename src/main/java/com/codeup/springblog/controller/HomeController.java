package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    @ResponseBody
    public String landing(){
        return "This is the landing page";
    }

//    @GetMapping("/{id}")
//    @ResponseBody
//    public String showOneAlbum(@PathVariable long id){
//        return "This is where you would view one album, with the id " + id;
//    }
//
//    @GetMapping("/create")
//    @ResponseBody
//    public String createAlbumsForm() {
//        return "This is where you would view the form to create an album in the database";
//    }
//
//    @PostMapping
//    @ResponseBody
//    public String  createAlbum(){
//        return "This is where the logic would be for when the create albums form is submitted";
//    }
}
