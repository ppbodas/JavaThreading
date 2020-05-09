public class SomeRandomClass {
    public int x = 0;

    public void doWork() {
        while (getX() != 10) {
            System.out.println("Hello World");
        }
        System.out.println("x = " + getX());
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
