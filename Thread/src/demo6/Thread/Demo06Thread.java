package demo6.Thread;

public class Demo06Thread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("main " + i);
        }
    }
}
