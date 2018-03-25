package bad;

import java.awt.*;

public class Circle extends Shape{
    private double itsRadius;
    private Point itsCenter;

    public double getItsRadius() {
        return itsRadius;
    }

    public void setItsRadius(double itsRadius) {
        this.itsRadius = itsRadius;
    }

    public Point getItsCenter() {
        return itsCenter;
    }

    public void setItsCenter(Point itsCenter) {
        this.itsCenter = itsCenter;
    }
    public void drawCircle() {
        System.out.println("draw circle,its center:"+this.getItsCenter()+",its radius:"+this.getItsRadius());
    }
}
