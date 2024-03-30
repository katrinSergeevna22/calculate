package com.example.calculation.controller;

import com.example.calculation.service.CalculationService;
import com.example.calculation.model.CalculationRequest;
import com.example.calculation.model.CalculationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping("/calculate")
    public CalculationResponse calculateVacationPay(CalculationRequest request) {
        try {
            return calculationService.calculateVacationPay(request);
        } catch (Exception e) {
            return new CalculationResponse(0.0);
        }
    }
}
