package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomicCounter {
	//private static AtomicInteger counter = new AtomicInteger(0);
	private static volatile int counter = 0;
    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
            	//counter.incrementAndGet(); // Atomic operation
                counter++;
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start(); t2.start();

        try { t1.join(); t2.join(); } catch (InterruptedException e) {}

       //System.out.println("Final counter: " + counter.get());
        System.out.println("Final counter: " + counter);
    }

}
