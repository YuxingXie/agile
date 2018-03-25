package guard;

import junit.framework.TestCase;

public class GuardTest extends TestCase{
    public GuardTest(String name) {
        super(name);
    }
    public void test(){
        Transporter transporter = new Transporter();

        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}
