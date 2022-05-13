package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class MathController {

    @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOneHundred(@PathVariable int number) {
        return number + " + 100 = " + (number + 100);
    }

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public double add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }

    @GetMapping(path = "/subtract/{num1}/from/{num2}")
    @ResponseBody
    public double threeMinusTen(@PathVariable double num1, @PathVariable double num2) {
        return num1 - num2;
    }
    @GetMapping(path = "/multiply/{num1}/and/{num2}")
    @ResponseBody
    public double fourTimesFive(@PathVariable double num1, @PathVariable double num2){
        return num1 * num2;
    }

    @GetMapping(path = "/divide/{num1}/by/{num2}")
    @ResponseBody
    public double divideSixByThree(@PathVariable double num1, @PathVariable double num2){
        return num1 / num2;
    }
}