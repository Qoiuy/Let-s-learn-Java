# Java OOP (面对对象程序设计)
### 封装 
#### 概念:指隐藏对象的属性和实现细节。仅对外提供公共访问方式。
#### 好处:将变化隔离；便于使用；提高重用性；安全性。 
#### 封装原则:将不需要对外提供的内容都隐藏起来，把属性都隐藏起来，提供共有方法对其访问。
------
### 单例模式
#### 解决的问题:保证一个类在内存中的唯一性
#### 举例:多个项目使用同一个配置文件，建议将该文件封装成一个类，这样就方便操作其中的数据了，又要保证多个程序读取到的文件是同一个配置文件，就需要确定该配置对象在内存中使唯一的。
#### 如何能保证对象的唯一性: 1不让其他程序创建该类。 2在本类中创建一个本类对象 3对外提供方法，让其他对象获取这个对象。
#### 代码实现 : 1 构造函数私有化 2内部产生该类的实例化 并将其封装成 private static 3静态方法返回该类的实例
#### 4种实现单例的例子:
`饿汉式 sington.Hungry 线程安全,特定情况下耗费内存`
![实现代码](https://github.com/Qoiuy/Let-s-learn-Java/blob/master/Java_OOP/src/main/java/sington/Hungry.java)
</br>`饱汉式（简单） sington.SimpleFull 线程不安全,特定情况下节约内存`
![实现代码](https://github.com/Qoiuy/Let-s-learn-Java/blob/master/Java_OOP/src/main/java/sington/SimpleFull.java)
</br>`饱汉式（sync）sington.SyncFull 线程安全,节约内存,但是同步方法调用频繁时 效率低`
![实现代码](https://github.com/Qoiuy/Let-s-learn-Java/blob/master/Java_OOP/src/main/java/sington/SyncFull.java)
</br>`饱汉式（best）sington.BestFull 线程安全,节约内存,多线程操作原子性`
![实现代码](https://github.com/Qoiuy/Let-s-learn-Java/blob/master/Java_OOP/src/main/java/sington/BestFull.java)
#### Runable解读

