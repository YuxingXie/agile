package bad;

public class Square extends Shape{
    private double itsSide;
    private double itsTopLeft;

    public double getItsSide() {
        return itsSide;
    }

    public void setItsSide(double itsSide) {
        this.itsSide = itsSide;
    }

    public double getItsTopLeft() {
        return itsTopLeft;
    }

    public void setItsTopLeft(double itsTopLeft) {
        this.itsTopLeft = itsTopLeft;
    }

    public void drawSquare() {
        System.out.println("draw square,its side:"+this.getItsSide()+",its top left:"+this.getItsTopLeft());
    }
}
