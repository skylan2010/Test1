import com.lan.it.utils.SingletonTest1;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new RunTest());
        t.start();
    }

    public static void test() {
        System.out.println(SingletonTest1.getInstance());
    }
    static class RunTest implements Runnable {

        @Override
        public void run() {
           for (int i = 0; i < 100; i++) {
                System.out.println(SingletonTest1.getInstance());
            }
        }
    }
}
