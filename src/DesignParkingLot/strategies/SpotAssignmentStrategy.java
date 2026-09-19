package DesignParkingLot.strategies;

import DesignParkingLot.models.ParkingLot;
import DesignParkingLot.models.ParkingSpot;
import DesignParkingLot.models.Vechile;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, Vechile vechile);
}
