import junit.framework.*;

public class TestGame extends TestCase {
    public TestGame(String name){
        super(name);
    }
    private Game g;
    public void setUp(){
        g=new Game();
    }
    public void testTwoThrowsNoMask(){
        g.add(5);
        g.add(4);
        assertEquals(9,g.score());
    }
    public void testFourThrowsNoMask(){
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18,g.score());
        assertEquals(9,g.scoreForFrame(1));
        assertEquals(18,g.scoreForFrame(2));
    }
}
