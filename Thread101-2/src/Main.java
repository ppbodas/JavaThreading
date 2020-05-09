public class Main {

    public static void main(String[] args) {
        SomeRandomClass someRandomClass = new SomeRandomClass();

        Thread t1 = new Thread(someRandomClass::doWork);
        t1.start();

        Thread t2 = new Thread(() -> someRandomClass.setX(10));
        t2.start();
    }
}
