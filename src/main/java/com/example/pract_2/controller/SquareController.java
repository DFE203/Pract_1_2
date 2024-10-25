package com.example.pract_2.controller;

import org.springframework.web.bind.annotation.*;
import com.example.pract_2.service.SquareService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api")
public class SquareController {
    private final SquareService squareService;

    public SquareController(SquareService squareService) {
        this.squareService = squareService;
    }

    @GetMapping("/square/{number}")
    public String calculateSquare(@PathVariable int number) throws InterruptedException, ExecutionException {
        Future<Integer> future = squareService.calculateSquareAsync(number);

        // Ожидание результата (если нужно вернуть сразу результат, а не Future)
        Integer result = future.get();

        return "Результат: " + result;
    }
}
