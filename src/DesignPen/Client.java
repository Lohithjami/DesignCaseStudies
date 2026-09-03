package DesignPen;

public class Client {
    public static void main(String[] args) {
        BallPen ballPen = new BallPen(
                "Reynolds",
                100,
                PenType.BALL,
                PenColor.Blue,
                0.7
        );
        ballPen.open();
        ballPen.Write();
        ballPen.refill();
        ballPen.close();

        FountainPen fountainPen = new FountainPen(
                "Butterfly",
                100,
                PenType.GEL,
                PenColor.Black,
                0.7
        );
        fountainPen.open();
        fountainPen.Write();
        fountainPen.close();

    }
}
