import java.util.Scanner;
class Area{
    float length,breadth;
    Area(){
        length=0;
        breadth=0;

    }Area(float a){
        length=a;
        breadth=a;

    }
    Area(float a,float b){     //overload constructor
        length=a;
        breadth=b;
    }
    Area(Area a){    //copy constructor
        length=a.length;
        breadth=a.breadth;
    }
    void space(){
        System.out.println("the are the shape is "+length*breadth);

    }

}
public class Constructor_overloading3 {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the value of length and breadth");


    float length=sc.nextFloat();
    float breadth=sc.nextFloat();
    Area obj=new Area();
    Area obj1=new Area(length,breadth);
    Area obj2=new Area(length);
    Area obj3=new Area(obj2);//copy contructor but not refernece object
        obj3.length=6;
        obj.space();
        obj1.space();
        obj2.space();
        obj3.space();






}}
