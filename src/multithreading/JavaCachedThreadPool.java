package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);// Simulate task
                    if(taskId == 2) {
                    	System.out.println("Task " + taskId + " sleep starts");
                    	Thread.sleep(70000);
                    	System.out.println("Task " + taskId + " sleep ends");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
