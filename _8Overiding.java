class Parent{
    void Show(int a){
        System.out.println("parent class show");
        System.out.println(a);
    }
    void Show(){
        System.out.println("parent class show");

    }

}
class Child extends Parent{
    void Show(){
        System.out.println("child class show");
    }
}
public class _8Overiding {
    public static void main(String []args){
    Child obj=new Child();
    obj.Show(6);
    obj.Show();
}}
//child class show has overwriteed the parent class show