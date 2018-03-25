package boygirl;

import junit.framework.TestCase;

public class BoyGirlTest extends TestCase{
    public BoyGirlTest(String name) {
        super(name);
    }
    public void test(){
        Gift g = new WildGift(new Ring());
        Boy boy=new Boy("Bob");
        boy.give(g,new Girl("Alice"));
    }
}
