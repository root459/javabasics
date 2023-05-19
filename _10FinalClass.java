import java.util.Scanner;
final class Circle{
    int radius;
    Circle(int a){
        radius=a;
    }
    //its methods are default final
    //cannot be inherited
    void Area(){
        System.out.println("the area of the circle is "+radius*radius*3.14);
    }

}
public class _10FinalClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=sc.nextInt();
        Circle obj=new Circle(radius);
        obj.Area();
    }
}
