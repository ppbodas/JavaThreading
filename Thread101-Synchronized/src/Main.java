public class Main {

    public static void main(String[] args) throws InterruptedException {
        SomeRandomClass someRandomClass = new SomeRandomClass();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; ++i) {
                someRandomClass.increment();
            }
            System.out.println("Completed incrementing in " + Thread.currentThread().getName());
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; ++i) {
                someRandomClass.increment();
            }
            System.out.println("Completed incrementing in " + Thread.currentThread().getName());
        }, "Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value = " + someRandomClass.getX());
    }
}