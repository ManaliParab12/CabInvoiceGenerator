package com.invoiceservice;

public class InvoiceGenerator {
    private static final int costPerTime = 1;
    private static final double minimumCostPerKilometer = 10.0;
    public double calculateFare(double distance, int time) {
        return distance * minimumCostPerKilometer + time * costPerTime;
    }
}
