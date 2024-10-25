package com.example.pract_2.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service
public class SquareService {
    private final ExecutorService executor = Executors.newCachedThreadPool();

    public Future<Integer> calculateSquareAsync(int number) {
        return executor.submit(() -> {
            // Имитация задержки от 1 до 5 секунд
            int delay = (int) (Math.random() * 5) + 1;
            TimeUnit.SECONDS.sleep(delay);
            return number * number; // Возвращаем квадрат числа
        });
    }
}



