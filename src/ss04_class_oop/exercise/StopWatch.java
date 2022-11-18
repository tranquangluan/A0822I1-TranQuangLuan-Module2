package ss04_class_oop.exercise;

public class StopWatch {
    private int startTime , endTime ;

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    double getElapsedTime(){
        return 1;
    }

    public static void main(String[] args) {

    }

}
