package com.example.calculation.service;

import com.example.calculation.model.CalculationRequest;
import com.example.calculation.model.CalculationResponse;

public interface CalculationService {

    CalculationResponse calculateVacationPay(CalculationRequest request);
}
