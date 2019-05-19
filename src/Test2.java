import com.lan.it.utils.SingletonTest;

public class Test2 {
    public static void main(String[] args) {
        Thread t = new Thread(new RunTest());
        t.start();
    }

    public static void test() {
        System.out.println(SingletonTest.getInstance());
    }
    static class RunTest implements Runnable {

        @Override
        public void run() {
           for (int i = 0; i < 100; i++) {
                System.out.println(SingletonTest.getInstance());
            }
        }
    }
}
