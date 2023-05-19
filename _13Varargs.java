//create a class Score and which can get any no. of arguments and return total and average score
import java.util.Scanner;
class Score{
    int total=0,number=0;


    void getScores(int ...score){
        number=score.length;

        for(int i:score){
            total+=i;



        }
        System.out.println("the total score is"+total);
        System.out.println("the average of score is "+total/number);
    }

}
public class _13Varargs {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values SEPARATED BY SPACE: ");
//        String[] stringValues = scanner.nextLine().split(" ");
        String[] stringValues = scanner.nextLine().split(" ");;
        

// Convert the String values to int values
        int[] intValues = new int[stringValues.length];
        for (int i = 0; i < stringValues.length; i++) {
            intValues[i] = Integer.parseInt(stringValues[i]);
        }
// Pass the values to the method

        Score obj=new Score();
        obj.getScores(intValues);
    }
}
