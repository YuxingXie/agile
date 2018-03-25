package objectadapter;

import junit.framework.TestCase;

public class ObjectAdapterTest extends TestCase{
    public ObjectAdapterTest(String name) {
        super(name);
    }
    public void test(){
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类，
        // 需要先创建一个被适配类的对象作为参数
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
