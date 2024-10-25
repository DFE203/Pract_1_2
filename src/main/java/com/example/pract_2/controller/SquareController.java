package com.example.pract_2.controller;

import org.springframework.web.bind.annotation.*;
import com.example.pract_2.service.SquareService;

@RestController
@RequestMapping("/api")
public class SquareController {
    private final SquareService squareService;

    public SquareController(SquareService squareService) {
        this.squareService = squareService;
    }

    @GetMapping("/square/{number}")
    public Integer calculateSquare(@PathVariable int number) throws InterruptedException {
        return squareService.calculateSquare(number);
    }
}
