package sington;

public class BestFull {

	//构造方法私有化
	private BestFull(){
		
	}
	
	//内部产生该类的实例化 并将其封装成 private static
	private static BestFull bestFull;
	
	//静态方法返回该类的实例
	public static BestFull getBestFull(){
		//使用同步代码块
		if(bestFull == null){
			synchronized (BestFull.class) {
				//本类初始化
				if(bestFull == null)
					bestFull = new BestFull();
			}
		}
		return bestFull;
	}
}
