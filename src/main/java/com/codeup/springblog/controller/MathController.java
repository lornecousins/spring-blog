package com.codeup.springblog.controller;

import com.codeup.springblog.services.MathService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class MathController {

    MathService mathService = new MathService();

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
//        return num1 / num2;
        return mathService.divide(num1, num2);
    }

    @GetMapping("/math")
    public String math() {
        return "math/index";
    }

    @PostMapping("/math")
    public String doMath
            (@RequestParam(name = "inputA") double inputA,
            @RequestParam(name = "inputB") double inputB,
             @RequestParam(name = "operation") String operation,
             Model model) {
//        double total = 0L;
//
//        switch (operation) {
//            case "add":
//                total = inputA + inputB;
//                break;
//            case "subtract":
//                total = inputA - inputB;
//                break;
//            case "multiply":
//                total = inputA * inputB;
//                break;
//            case "divide":
//                total = inputA / inputB;
//                break;
        double total = mathService.doOperation(operation, inputA, inputB);
        model.addAttribute("total", total);
        return "math/index";
    }

}