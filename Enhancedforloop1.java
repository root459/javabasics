
import java.util.Scanner;
public class Enhancedforloop1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int sum=0;

        for(int j:a){
            System.out.printf("the elements of array are %d \n",j);
        }
        for(int i:a){
            sum=sum+i;
        }
        System.out.printf("the sum of the elements of array is %d \n",sum);

    }

}
