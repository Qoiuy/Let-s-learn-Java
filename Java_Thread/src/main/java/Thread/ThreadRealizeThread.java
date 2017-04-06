package Thread;

/** 
 * 继承Thread方法来实现开启进程
 * @author iszhanggc@163.com
 *
 */
public class ThreadRealizeThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("创建了新线程");
	}
	
	
	public static void main(String[] args) {
		ThreadRealizeThread thread = new ThreadRealizeThread();
		thread.start();
		
	}
}
