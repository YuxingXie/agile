# 敏捷开发与设计模式

当时只记得写代码，没有写学习心得，现在一个个补上吧！

每个子项目都一个设计模式或设计原则命名，比如观察者模式子项目为observer，lsp原则研究项目为lsp，等等。

## 观察者模式(Observer)

可能又被称为生产者/消费者模式。

* 被观察者维护一个观察者列表

* 被观察者主动通知观察者
 
* 观察者提供一个事件发生时的处理方法


项目包含clock和guard两个包，分别是Observer模式的两种实现，其中clock的实现有点难懂，就
以guard为例说明：

警察(Police)、小偷(Thief)和保安(Security)都是观察者(Wathcer)，运输队是被观察者(Watched)。
```java
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
```