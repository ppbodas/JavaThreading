import java.util.Random;

public class SomeRandomClass {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    SomeRandomClass() {
        threadLocal.set(new Random().nextInt());
        System.out.println("Value form constructor " + threadLocal.get());
    }

    public void printValue() {
        System.out.println("Value " + threadLocal.get());
    }

    public void setValue(final int value) {
        threadLocal.set(value);
    }
}
