import java.util.Scanner;
class Room{
    int length,breadth;
    Room(int a,int b){
length=a;
breadth=b;
    }
    void area(){
        System.out.println("the area of the room is "+length*breadth);
    }

}
class Bedroom extends Room{
int height;
Bedroom(int a,int b,int c){
    super(a,b);
    height=c;

}
void volume(){
    System.out.println("the volume of the bedroom is "+length*breadth*height);
}
}

public class _7Super {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length breadth height of the room");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
                int height=sc.nextInt();
        Bedroom obj=new Bedroom(length,breadth,height);
        obj.area();
        obj.volume();

    }
}
