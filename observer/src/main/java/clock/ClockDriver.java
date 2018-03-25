package clock;

public class ClockDriver {
    private TimeSink timeSink;
    public ClockDriver(TimeSource source,TimeSink sink){
        source.setDriver(this);
        this.timeSink=sink;
    }
    public void update(int hours,int minutes,int seconds){
        this.timeSink.setTime(hours,minutes,seconds);
    }
}
