import java.util.Scanner;
//write a program in which breadth of a room cannot be changed and find its area and height
class Areas{
    int length;
    final int breadth=20;
    Areas(int a){
        length=a;
    }
    final void area(){
        System.out.println("the area of this room is "+length*breadth);
    }
    //this method cannot be overided now
}
class Volume extends Areas{
    int height;
    Volume(int a,int b){
        super(a);
        height=b;
    }
    void volume(){
        System.out.println("the volume of the room is "+height*breadth*length);

    }
//    void area(){
//        System.out.println("in sub class"); remove this to get error by overiding final class
//    }
}
public class _9Finalvar_methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and height of the room");
        int length=sc.nextInt();
        int height=sc.nextInt();
        Volume obj=new Volume(length,height);
        obj.area();
        obj.volume();


    }
}

