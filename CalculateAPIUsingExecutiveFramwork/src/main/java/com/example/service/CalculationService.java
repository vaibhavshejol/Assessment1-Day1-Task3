package com.example.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationService {

    private static final Logger log = LoggerFactory.getLogger(CalculationService.class);
    private final ExecutorService executor = Executors.newFixedThreadPool(8);

    public void performCalculations(int number) {
        executor.submit(() -> calculateSquare(number));
        executor.submit(() -> calculateCube(number));
        executor.submit(() -> checkEven(number));
        executor.submit(() -> checkPrime(number));
        executor.submit(() -> checkArmstrong(number));
        executor.submit(() -> checkPalindrome(number));
        executor.submit(() -> calculateFactorial(number));
        executor.submit(() -> calculateReverse(number));
    }

    public void shutdownExecutor() {
        executor.shutdown();
    }
    
}
