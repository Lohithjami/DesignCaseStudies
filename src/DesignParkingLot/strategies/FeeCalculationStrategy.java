package DesignParkingLot.strategies;

import DesignParkingLot.models.Ticket;

public interface FeeCalculationStrategy {
    double calculateFees(Ticket ticket);
}
