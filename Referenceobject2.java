import java.util.Scanner;

class Reference{
    int length,breadth;
    Scanner sc=new Scanner(System.in);
    void getInput(){
        System.out.println("enter the length and breadth");
        length=sc.nextInt();
        breadth=sc.nextInt();

    }
    void area(){
        System.out.println("the area of the rectangle is"+length*breadth);
    }
}
public class Referenceobject2 {
    public static void main(String []args){
        Reference d=new Reference();
        d.getInput();
        Reference e=d;//e and d are refernce objects point to same loxation
        e.area();
        d.length=5;
        System.out.println("the changed value is reflected in e also"+e.length);

    }

}
