package randoom;
import java.util.Random;


public class Randoom1 {
    public static void main(String[] args) {
        int[] arr= new int[1000];
        int count =0;
        for(int i=0;i<arr.length;i++){
            Random random = new Random();
            arr[i]=random.nextInt(1000);
        }

        for(int i=0;i<arr.length;i++){
                if(arr[i]<500){
                    System.out.println(arr[i]);
                    count++;
                }

        }







    }


}
