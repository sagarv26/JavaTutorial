package multithreading;

public class JavaVolatile {
	private static volatile boolean flag = false;
	
	public static void main(String[] args) {
		Thread writer = new Thread(() -> {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
			flag = true;
			System.out.println("Writer thread updated flag to true");
		});
		
		Thread reader = new Thread(() -> {
			while (!flag) {
				// Volatile ensures this sees updated value
			}
			System.out.println("Reader thread detected flag change");
		});
		
		writer.start();
		reader.start();
	}
}
