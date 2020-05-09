public class Main {

    public static void main(String[] args) {
        SomeRandomClass someRandomClass = new SomeRandomClass();

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("From thread return " + someRandomClass.getX());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            someRandomClass.setX(5);
        });
        t2.start();
    }
}
