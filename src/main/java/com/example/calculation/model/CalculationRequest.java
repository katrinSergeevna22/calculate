package com.example.calculation.model;

public class CalculationRequest {
    private double averageSalary;
    private int vacationDays;
    private int exactVacationDays;
    public CalculationRequest(double averageSalary, int vacationDays, int exactVacationDays){
        this.averageSalary = averageSalary;
        this.exactVacationDays = exactVacationDays;
        this.vacationDays = vacationDays;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public int getExactVacationDays() {
        return exactVacationDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public void setExactVacationDays(int exactVacationDays) {
        this.exactVacationDays = exactVacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}


