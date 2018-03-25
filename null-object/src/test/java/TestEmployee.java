import junit.framework.TestCase;

import java.util.Date;

public class TestEmployee extends TestCase {
    public TestEmployee(String name){
        super(name);
    }
    public void testNull(){
        Employee e=DB.getEmployee("Bob");
        e.pay();
    }
}
