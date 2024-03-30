package com.example.calculation.service;

import com.example.calculation.model.CalculationRequest;
import com.example.calculation.model.CalculationResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public CalculationResponse calculateVacationPay(CalculationRequest request) {
        double result = 0.0;

        result = request.getAverageSalary() / 12 * request.getVacationDays();

        return new CalculationResponse(result);
    }


}
