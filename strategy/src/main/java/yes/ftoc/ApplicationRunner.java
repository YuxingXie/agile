package yes.ftoc;

public class ApplicationRunner {
    private Application application;
    public ApplicationRunner(Application application){
        this.application=application;
    }

    /**
     * 此方法在非策略模式中位于Application类中，在这里ApplicationRunner持有一个Application对象，
     * 但是这个Application对象中没有run()方法了，方法移到了这里。
     * 这个做法就是策略模式的核心了，把算法抽取出来，减少了算法和算法细节间的耦合
     */
    public void run(){
        application.init();
        while (!application.done()){
            application.idle();
        }
        application.cleanup();
    }
    public static void main(String[] args){
        new ApplicationRunner(new FtocStrategy()).run();
    }
}
