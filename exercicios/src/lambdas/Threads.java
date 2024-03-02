package lambdas;

public class Threads {

	public static void main(String[] args) {
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("teste");
				}
			}
		};
		
		Thread t = new Thread(t1);
		t.start();
	}
}
