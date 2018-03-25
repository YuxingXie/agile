package classadapter;

import junit.framework.TestCase;

public class ClassAdapterTest extends TestCase {
    public ClassAdapterTest(String name) {
        super(name);
    }
    public void test(){
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}
