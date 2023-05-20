class Animalsound{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Catsound extends Animalsound{
    void sound(){
        System.out.println("cat meows!!");
    }

}
class Dogsound extends Animalsound{
    void sound(){
        System.out.println("it barks!!");
    }
}
class Humansound{
    void sound(){
        System.out.println("human speaks");
    }
}
public class _14DynamicMethodDispatch {
    public static void main(String[] args) {
        Animalsound obj=new Catsound();//dynamic binding
        //actual obj type determines which method to be called at runtime
        Animalsound obj1=new Animalsound();//dynamic binding
        Animalsound obj2=new Dogsound();//dynamic binding
        obj.sound();
        obj1.sound();
        obj2.sound();
        Humansound obj3=new Humansound();
        obj3.sound();//static binding


    }
}
