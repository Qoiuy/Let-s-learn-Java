package sington;

/**
 * 饿汉式单例
 * 线程安全，不存在多线程同步问题
 * 当类被加载时，会初始化static的单例类。因此在特定情况下会耗费内存。
 * @author iszhanggc@163.com
 *
 */
public class Hungry {
	
	//构造方法私有化
	private Hungry(){
		
	}
	
	//内部产生该类的实例化 并将其封装成 private static
	private static final Hungry hungry = new Hungry();
	
	//静态方法返回该类的实例
	public static Hungry getHungry(){
		return hungry;
	}

}
