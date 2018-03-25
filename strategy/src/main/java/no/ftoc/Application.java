package no.ftoc;

/**
 * 这里滥用了模板方法模式，导致不必要的复杂性
 */
public abstract class Application {
    private boolean isDone=false;

    protected abstract void init();
    protected abstract void idle();
    protected abstract void cleanup();

    protected void setDone(){
        isDone=true;
    }

    protected boolean done(){
        return isDone;
    }

    public void run(){
        init();
        while (!done()){
            idle();
        }
        cleanup();
    }
}
