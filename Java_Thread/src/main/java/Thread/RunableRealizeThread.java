package Thread;

/**
 * 使用runable实现Thread
 * @author iszhanggc@163.com
 *
 */
public class RunableRealizeThread implements Runnable {
	public void run() {
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		RunableRealizeThread t = new RunableRealizeThread();
		Thread thread = new Thread(t);
		thread.start();
	}

}
