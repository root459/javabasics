import java.util.Scanner;
abstract class Shape {
    abstract void area();
}
class Rectangle extends Shape{
    int length,breadth;
    Rectangle(int a,int b){
        length=a;
        breadth=b;
    }
    void area(){
        System.out.println("the area of rectangle is "+length*breadth);
    }

}
class Circles extends Shape{
    int radius;
    Circles(int a){
        radius=a;
    }
    void area(){
        System.out.println("the area of the circle is "+radius*radius*3.14);
    }
}
public class _12AbstractClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth of rectangle");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println("enter the radius of the circle");
        int radius=sc.nextInt();
        Circles obj=new Circles(radius);
        Rectangle obj1=new Rectangle(length,breadth);
        obj.area();
        obj1.area();
    }
}
