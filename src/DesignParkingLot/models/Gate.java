package DesignParkingLot.models;

public class Gate extends BaseModel{
    private GateType gateType;
    private int gateNumber;
    private GateStatus status;
    private Operator currentOperattor;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public Operator getCurrentOperattor() {
        return currentOperattor;
    }

    public void setCurrentOperattor(Operator currentOperattor) {
        this.currentOperattor = currentOperattor;
    }
}
