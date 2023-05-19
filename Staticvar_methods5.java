//create a program to implement static  variable and methods which count no of student visit the result website
import java.util.Scanner;
class Result{
    Scanner sc=new Scanner(System.in);
    int maths,science,hindi,english;
    static int count=0;
    void getValue(){
        System.out.println("enter the marks for the maths science hindi english");
        maths=sc.nextInt();
        science=sc.nextInt();
        hindi=sc.nextInt();
        english=sc.nextInt();

        }

    void percentage(){
        int percent=(maths+science+hindi+english)/400*100;
        System.out.println("the percentage is "+percent);
        count++;

    }
    static void getCount(){
        System.out.println("total no. of students visited are "+count);
    }
}
public class Staticvar_methods5 {
    public static void main(String []args){

    Result[] s=new Result[3];//objects of array
     for(int i=0;i<3;i++){
         s[i]=new Result();
         System.out.println("enter the marks for "+(Result.count+1)+"student");
         s[i].getValue();
     }
     Result.getCount();//calling without object directly with class name
        System.out.println("the value of count is "+Result.count);// calling count without object

        for(int i=0;i<3;i++){
            s[i].percentage();
        }
        Result.getCount();//calling without object directly with class name
        System.out.println("the value of count is "+Result.count);// calling count without object


}}
//    In Java, when you create an array, like Result[] s = new Result[3];, the array itself is ready, but each slot in the array is initially empty (null). It's like having three empty slots to put objects in.

//        To use each slot in the array, you need to create a Result object and place it in that slot. It's similar to getting three boxes and putting something inside each box.

//        So, the line s[i] = new Result(); is needed to create a new Result object and assign it to the i-th slot in the array. It means you are creating an object and placing it in the specific slot so that you can use it later.
