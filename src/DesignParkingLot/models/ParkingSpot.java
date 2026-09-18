package DesignParkingLot.models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private List<VechileType>supportedVechileType;
    private int floorNumber;
    private ParkingSpotStatus status;
    private ParkingFloor parkingFloor;

    public List<VechileType> getSupportedVechileType() {
        return supportedVechileType;
    }

    public void setSupportedVechileType(List<VechileType> supportedVechileType) {
        this.supportedVechileType = supportedVechileType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
