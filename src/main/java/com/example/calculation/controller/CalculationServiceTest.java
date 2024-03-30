package com.example.calculation.service;

import com.example.calculation.model.CalculationRequest;
import com.example.calculation.model.CalculationResponse;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationServiceTest {

    @Test
    public void testCalculateVacationPay() {
        CalculationService calculationService = new CalculationServiceImpl();
        CalculationRequest request = new CalculationRequest(6000.0, 20, 5);
        CalculationResponse response = calculationService.calculateVacationPay(request);
        assertEquals(10000.0, response.getVacationPay());
    }
}
