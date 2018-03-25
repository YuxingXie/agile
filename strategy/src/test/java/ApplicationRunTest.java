import junit.framework.TestCase;
import no.ftoc.Application;
import no.ftoc.FtocTemplateMethod;

public class ApplicationRunTest extends TestCase {
    public void test(){
        Application application=new FtocTemplateMethod();
        application.run();
    }
}
