public class Main {

    public static void main(String[] args) throws InterruptedException {
        SomeRandomClass someRandomClass = new SomeRandomClass();

        Thread t1 = new Thread(someRandomClass);
        Thread t2 = new Thread(someRandomClass);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
