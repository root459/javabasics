
public class _11FinalizeMethod {
    public void finalize(){ //overriding finalize method &called only on class
        System.out.println("garbage collection");//automatically called to free null object
    }
    void show(){
        System.out.println("about to end");
    }

    public static void main(String[] args) {
        _11FinalizeMethod obj=new _11FinalizeMethod();
        obj.show();

        System.gc();//requesting jvm to call garbage collector
    }
}
