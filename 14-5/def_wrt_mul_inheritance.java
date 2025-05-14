interface Left {
    default void m1(){
        System.out.println("Default Left Method");
    }
    
}
interface Right {
    default void m1(){
        System.out.println("Default Right Method");
    }
    
}
public class def_wrt_mul_inheritance implements Left,Right{
    //Override the method
    public void m1(){
        System.out.println("My own implementation");
        Left.super.m1();       // without  overriding gives error 
        Right.super.m1();
    }

    public static void main(String[] args) {
        def_wrt_mul_inheritance a=new def_wrt_mul_inheritance();
        a.m1();
    }

}
