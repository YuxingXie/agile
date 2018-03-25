public class SleepCommand implements Command {

    private Command wakeupCommand=null;
    private ActiveObjectEngine engine=null;
    private long sleepTime;
    private long startTime=0;
    private boolean started=false;

    public SleepCommand(Command wakeupCommand, ActiveObjectEngine engine, long sleepTime) {
        this.wakeupCommand = wakeupCommand;
        this.engine = engine;
        this.sleepTime = sleepTime;
    }

    @Override
    public void execute() {
        long currentTime=System.currentTimeMillis();
        if(!started){
            started=true;
            startTime=currentTime;
            engine.addCommand(this);
            System.out.println("sleep command now start!");

        }else if(currentTime-startTime<sleepTime){
            engine.addCommand(this);
            System.out.println("sleep command execute again,sleep time not over!");
        }else {
            engine.addCommand(wakeupCommand);
            System.out.println("sleep time over,execute finished!");
        }
    }
}
