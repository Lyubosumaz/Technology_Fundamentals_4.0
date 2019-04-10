package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

    @PostMapping("/")
    public String calculate(@RequestParam String leftOperand, @RequestParam String operator,
                            @RequestParam String rightOperand, Model model) {
        double numOne;
        double numTwo;

        try {
            numOne = Double.parseDouble(leftOperand);
        } catch (NumberFormatException exception) {
            numOne = 0.0;
        }

        try {
            numTwo = Double.parseDouble(rightOperand);
        } catch (NumberFormatException exception) {
            numTwo = 0.0;
        }
        boolean isZero =false;
        if (operator.equals("/")&& numTwo==0){
            isZero=true;
        }

        Calculator calculator = new Calculator(numOne, numTwo, operator);

        double result = calculator.calculateResult();

        model.addAttribute("leftOperand", calculator.getLeftOperand());
        model.addAttribute("operator", calculator.getOperator());
        model.addAttribute("rightOperand", calculator.getRightOperand());

        model.addAttribute("result", result);

        model.addAttribute("flag" , isZero);

        model.addAttribute("view", "views/calculatorForm");

        return "base-layout";
    }
}