package sington;

/**
 * 学习runtime
 * @author iszhanggc@163.com
 *
 */
public class LearnRunAble {

	public static void main(String[] args) {
		//通过阅读Runtime的源码可知 Runtime是一个单例模式 线程不安全
		//使用的时候需要使用Runtime.getRuntime()来取出类
		//简单使用  查看虚拟机可用处理器数目
		int sum = Runtime.getRuntime().availableProcessors();
		System.out.println(sum);
	}
}
