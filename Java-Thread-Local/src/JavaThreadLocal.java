
public class JavaThreadLocal {
	public static void main(String... arg) {
		Thread t1 =new Thread(new SampleThread());
		Thread t2 =new Thread(new SampleThread());
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
