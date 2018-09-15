import java.util.Random;

public class SampleThread implements Runnable {
	SingletonResource singleObject;
	public void run() {
		Random r=new Random();
		singleObject=SingletonResource.getSingletomObject();
		for(int i=0; i< r.nextInt(125);i++)
		singleObject.setValue();
		
		System.out.println(Thread.currentThread().getId()+" "+singleObject.getvalue());
	}
}


