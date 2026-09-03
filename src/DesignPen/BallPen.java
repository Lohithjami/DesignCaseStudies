package DesignPen;

public class BallPen extends Pen implements Refillable{
    public BallPen(String penBrand, int penPrice, PenType penType, PenColor penColor, double nibDiamater) {
        super(penBrand, penPrice, penType, penColor, nibDiamater);
    }

    @Override
    public void refill() {
        System.out.println(getPenBrand() + " is being refilled.");
    }
}
