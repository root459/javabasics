
import java.util.Scanner;

class Overload{

    int area(int a,int b){
        return a+b;
    }
    float area(float a,float b){
        return a+b;
    }
    float area(float a){
        return a*a;
    }
    int area(int a){
        return a*a;
    }
}
public class MethodOverloading4 {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        Overload obj = new Overload();
        System.out.println("enter the values of length and breadth in decimal point");
        float a=sc.nextFloat();
        float b= sc.nextFloat();
        System.out.println("enter the length and breadth");
        int c= sc.nextInt();
        int d=sc.nextInt();
        System.out.println("the area of rectangle is"+obj.area(a,b));
        System.out.println("the area of rectangle by integers values is "+obj.area(c,d));
        System.out.println("the area of square is by float value is "+obj.area(a));
        System.out.println("the area of square is by int value is "+obj.area(c));



    }


}
