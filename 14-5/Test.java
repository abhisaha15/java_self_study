interface interf{
    public void m1();
}

public class Test {
    int x=10; //instance variable

    public void m2(){
        int y=20;
        interf i=()->{
            //y=30;  //error: local variables referenced from a lambda expression must be final or effectively final y=30;
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.m2();
    }
}
