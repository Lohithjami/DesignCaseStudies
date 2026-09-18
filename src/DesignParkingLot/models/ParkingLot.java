package DesignParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VechileType> supportedVechileType;
    private ParkingLotStatus status;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VechileType> getSupportedVechileType() {
        return supportedVechileType;
    }

    public void setSupportedVechileType(List<VechileType> supportedVechileType) {
        this.supportedVechileType = supportedVechileType;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
