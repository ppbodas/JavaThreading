import java.util.concurrent.atomic.AtomicInteger;

public class SomeRandomClass {
    private AtomicInteger x;

    public SomeRandomClass() {
        this.x = new AtomicInteger(0);
    }

    public void increment() {
        x.getAndIncrement();
    }

    public int getX() {
        return x.get();
    }
}
