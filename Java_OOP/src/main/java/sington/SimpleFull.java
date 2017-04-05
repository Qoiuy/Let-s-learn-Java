package sington;

/**
 * 饱汉式 
 * 并发情况下很可能出现多个实例的情况
 * 当调用时再初始化实例 节约一些内存
 * @author iszhanggc@163.com
 *
 */
public class SimpleFull {
	
	//构造方法私有化
	private SimpleFull(){
		
	}
	
	//内部产生该类的实例化 并将其封装成 private static
	private static SimpleFull simpleFull;
	
	//静态方法返回该类的实例
	public static SimpleFull getsimpleFull(){
		if(simpleFull == null)
			simpleFull = new SimpleFull();
		return simpleFull;	
	}

}
