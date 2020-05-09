public class SomeRandomClass {
    static private int x = 2;

    public int getX() throws InterruptedException {
        System.out.println("x = " + x);
        Thread.sleep(5000);
        return x;
    }

    public void setX(int temp) {
        x = temp;
    }
}
