package ss04_class_oop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private double startTime , endTime ;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    double start(){
        return this.startTime=System.currentTimeMillis();
    }

    double stop(){
        return this.endTime = System.currentTimeMillis();
    }

    double getElapsedTime(){
        this.stop();
        return this.endTime-this.startTime;
    }

    double selectionSort(){
        return stop()-start();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; ++i) {
            array[i] = array.length - i;
        }

        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        System.out.println("The time it take is: " + watch.getElapsedTime());

    }

}
