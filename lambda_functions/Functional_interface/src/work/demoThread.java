package work;

public class demoThread {
    public static void main(String[] args) {
        Runnable thread1=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("value of i"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t=new Thread(thread1);
        t.setName("John");
        t.start();

        Runnable t2=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t22=new Thread(t2);
        t22.start();

        //thread for multitasking or executing multiple process at same time


    }

}
