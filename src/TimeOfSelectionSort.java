import java.util.Scanner;

public class TimeOfSelectionSort {

    public static void main(String[] args) {
        // vi class StopWatch nam chung package nen ta ko can import class nay
        StopWatch stopWatch = new StopWatch();
        // nhap mang size phan tu
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of Array: ");
        size = scanner.nextInt();

        double[] array = new double[size];
        stopWatch.start();
        for(int i=0; i< array.length; i++){
            array[i]=  Math.round(size*Math.random());
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        stopWatch.stop();


        System.out.println("startTime: "+stopWatch.getStartTime());
        System.out.println("stopTime: "+stopWatch.getEndTime());
        System.out.println("ElapsedTime: "+stopWatch.getElapsedTime());






    }

}
