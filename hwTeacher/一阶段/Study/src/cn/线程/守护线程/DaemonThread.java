package cn.线程.守护线程;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("我是守护线程！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("wrong我是守护线程！");
			}
		}
	}

}
