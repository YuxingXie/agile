package clock;

public class MockTimeSource implements TimeSource {
    private ClockDriver clockDriver;
    @Override
    public void setDriver(ClockDriver driver) {
        this.clockDriver=driver;
    }
    public void setTime(int hours,int minutes,int seconds){
        this.clockDriver.update(hours,minutes,seconds);
    }
}
