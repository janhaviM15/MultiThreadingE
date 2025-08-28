package multithreading;

public class Ex2 implements Runnable
{
	public void run ()
	{
		System.out.println("Thread is Running!!...");
	}

	public static void main(String[] args) 
	{
		Ex2 obj = new Ex2();
		Thread t = new Thread(obj);
		t.start();
	}

}
