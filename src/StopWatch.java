public class StopWatch {
    private double startTime, endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public  StopWatch() {
    }

    public void start(){
         startTime = System.currentTimeMillis();
    }
    public void stop() {
         endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return endTime -startTime;
    }
}
