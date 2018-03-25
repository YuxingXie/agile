import junit.framework.*;
import junit.textui.TestRunner;

public class TestSleepCommand extends TestCase{
    public static void main(String[] args){
        TestRunner.main(new String[]{"TestSleepCommand"});
    }

    public TestSleepCommand(String name){
        super(name);
    }

    private boolean commandExecuted=false;

    public void testSleep() throws Exception{
        Command wakeup=new Command(){
            public void execute(){commandExecuted=true;}
        };
        ActiveObjectEngine e=new ActiveObjectEngine();
        SleepCommand c=new SleepCommand(wakeup,e,100);
        e.addCommand(c);
        long start=System.currentTimeMillis();
        e.run();
        long stop=System.currentTimeMillis();
        long sleepTime=(stop-start);
        assertTrue("SleepTime "+sleepTime+" expected >= 100",sleepTime>=100);
        assertTrue("Command executed",commandExecuted);
    }
}
