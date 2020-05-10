import java.util.Random;

public class SomeRandomClass implements Runnable {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override public void run() {
        threadLocal.set((new Random().nextInt()));

        System.out.println("Random value " + threadLocal.get());
    }
}
