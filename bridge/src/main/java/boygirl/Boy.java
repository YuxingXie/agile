package boygirl;

//Boy类，追求MM的男孩

public class Boy {
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void pursue(Girl mm) {
        //Gift g = new WarmGift(new Flower());
        Gift g = new WildGift(new Ring());
        //give(g, mm);
    }
    public void give(Gift g, Girl mm) {
    }
}