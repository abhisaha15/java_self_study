package work;

public class Main {
    public static void main(String[] args) {
        // implements using class
        MyInterImple m=new MyInterImple();
        m.sayHello();

        // using  interface directly
        // this is also known as anonymous class
        myInter i=new myInter() {
            @Override
            public void sayHello() {
                System.out.println("I am using inteface directly");
            }
        };
        i.sayHello();

        // using lambda function

        myInter m1=()-> System.out.println("Lambda Function is used since single statement so no braces used");
        m1.sayHello();

        sumofInter s1=(int a,int b)->{
          int s=a+b;
          return s;
        };

        int sum1=s1.sum(5,4);
        System.out.println(sum1);

        // without declaring data types
        sumofInter s2=(a,b)->{
            int s=a+b;
            return s;
        };
        int sum2=s2.sum(10,5);
        System.out.println(sum2);

        strlength ss=(str) -> str.length();

        int l=ss.len("hgjhfsgjfbgdb");
        System.out.println(l);
    }



}