import java.util.Vector;

public class CompositeShape implements Shape {
    private Vector shapes=new Vector();
    public void add(Shape s){
        shapes.add(s);
    }
    @Override
    public void draw() {
        for (int i=0;i<shapes.size();i++){
            Shape shape=(Shape)shapes.elementAt(i);
            shape.draw();
        }
    }
}
