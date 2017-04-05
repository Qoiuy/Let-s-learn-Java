package sington;

/**
 * 饱汉式
 * 为了保证线程安全 这里使用了synchronized 但是同步方法调用频繁时 效率低
 * @author iszhanggc@163.com
 *
 */
public class SyncFull {
	
	//构造方法私有化
	private SyncFull(){
		
	}
	
	//内部产生该类的实例化 并将其封装成 private static
	private static SyncFull syncFull;
	
	//静态方法返回该类的实例
	public static synchronized SyncFull getSyncFull(){
		if( syncFull == null) 
			syncFull = new SyncFull();
		return syncFull;
	}
}
