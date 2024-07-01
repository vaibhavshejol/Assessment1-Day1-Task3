package com.example.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculationService;

@RestController
public class CalculationController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(CalculationController.class);

    @Autowired
    private CalculationService calculationService;

    @PostMapping("/calculate/{number}")
    public String calculate(@PathVariable ("number") int number) {
        log.info("Request received to perform calculation on number: {}", number);

        try {
            calculationService.performCalculations(number);
            log.info("Calculation tasks started for number: {}", number);
        } catch (Exception ex) {
            log.error("Exception occurred while performing calculations for number {}: {}", number, ex.getMessage());
            return "Error occurred during calculations for number: " + number;
        }

        return "Calculations completed for number: " + number;
    }

    
    @PostMapping("/shutdown")
    public String shutdown() {
        calculationService.shutdownExecutor();
        return "Executor service shutdown initiated.";
    }
}
