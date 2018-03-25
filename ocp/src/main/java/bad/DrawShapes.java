package bad;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawShapes {
    public void draw(List<Shape> shapeList){
        for(Shape shape:shapeList){
            if(shape.getShapeType()==ShapeType.CIRCLE){
                ((Circle) shape).drawCircle();
            }else if(shape.getShapeType()==ShapeType.SQUARE){
                ((Square)shape).drawSquare();
            }else{
                System.out.println("unknown shape type!");
            }
        }
    }


    public static void main(String[] args){
        List<Shape> shapes=new ArrayList<>();
        Circle circle=new Circle();
        circle.setItsCenter(new Point(7,8));
        circle.setItsRadius(8.99d);
        circle.setShapeType(ShapeType.CIRCLE);
        shapes.add(circle);
        Square square=new Square();
        square.setItsSide(63d);
        square.setItsTopLeft(12d);
        square.setShapeType(ShapeType.SQUARE);
        shapes.add(square);
        new DrawShapes().draw(shapes);
    }
}
