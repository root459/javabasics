import java.util.Scanner;
class Nest{
    Scanner sc=new Scanner(System.in);
    int a,b;
    int sum(int num1,int num2){
        return num2+num1;

    }
    void getInputResutl(){
        System.out.println("enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=sum(a,b);//a method can call other method also in it is called method nesting
        System.out.println("the value of c is "+c);
        System.out.println("the sum of a and b is "+sum(a,b));//calling sum

    }


}
public class _6NestingMethods {
    public static void main(String []args){
    Nest obj=new Nest();
    obj.getInputResutl();

}}
