package 线程.wilt;

public class Test {

	public static void main(String[] args) {
		MyWaitAndNotify my = new MyWaitAndNotify();
		Thread th1 = new Thread(my,"线程1");
		Thread th2 = new Thread(my,"线程2");
		Thread th3 = new Thread(my,"线程3");	
		
		th1.start();
		th3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		
		th2.start();
	}
}
