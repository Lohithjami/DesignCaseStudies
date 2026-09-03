package DesignPen;

public abstract class Pen {
    private String penBrand;
    private int penPrice;
    private PenType penType;
    private PenColor penColor;
    private double nibDiamater;

    public Pen(String penBrand, int penPrice, PenType penType, PenColor penColor, double nibDiamater)
    {
        this.penBrand = penBrand;
        this.penPrice = penPrice;
        this.penType = penType;
        this.penColor = penColor;
        this.nibDiamater = nibDiamater;
    }
    public void Write()
    {
        System.out.println(penBrand + " is writing.");
    }
    public void open() {
        System.out.println(penBrand + " pen is opened.");
    }
    public void close() {
        System.out.println(penBrand + " pen is closed.");
    }
    public String getPenBrand()
    {
        return penBrand;
    }

    public void setPenBrand(String penBrand) {
        this.penBrand = penBrand;
    }

    public int getPenPrice() {
        return penPrice;
    }

    public void setPenPrice(int penPrice) {
        this.penPrice = penPrice;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }

    public PenColor getPenColor() {
        return penColor;
    }

    public void setPenColor(PenColor penColor) {
        this.penColor = penColor;
    }

    public double getNibDiamater() {
        return nibDiamater;
    }

    public void setNibDiamater(double nibDiamater) {
        this.nibDiamater = nibDiamater;
    }
}
