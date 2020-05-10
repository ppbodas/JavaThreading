public class Main {

    public static void main(String[] args) throws InterruptedException {
        SomeRandomClass someRandomClass = new SomeRandomClass();

        Thread t1 = new Thread(() -> {
            someRandomClass.setValue(100);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            someRandomClass.printValue();
        });

        Thread t2 = new Thread(() -> {
            someRandomClass.setValue(500);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            someRandomClass.printValue();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
