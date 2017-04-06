# Java Thread 线程
## 多线程
------
### 创建线程的第一种方式 继承Thread,重写run方法 ThreadRealizeThread
#### 实现，1定义类继承Thread。2重写run方法。3创建子类。4执行run方法
#### 线程的5个状态 创建 运行 冻结 阻塞 消亡
#### sleep和wait区别
	sleep指线程被调用时 占着cpu不工作(形象的解释：sleep状态就是强制让该线程进行读秒操作。)
	wait状态 线程不占用cpu
------

### 创建线程的第二种方式 实现Runable RunableRealizeThread
#### 实现。1定义类实现Runable.2重写run方法，3创建子类。4调用线程的start方法开启线程。(说实话哈：我很佩服写Thread的大神。Thread里面的才是真的有真材实料。以至于我们实现了Runable接口还得使用Thread来创建线程 2333)
------

### 线程安全问题(存在共享数据) 需要实现
#### 解决方案:synchronized 没写完呢 只知道 能修饰方法SynchronizedDealThread
------

### 死锁 介绍 需要实现
#### 什么时候产生死锁

#以上内容为传智播客整理 代码实现为网上收集和自己整理。

###Thread源码  分析 有时间整
