# Java Map 集合相关知识
### 集合关系图 
</br>![](https://github.com/Qoiuy/Let-s-learn-Java/raw/master/Java_Map/01.jpg)


### Collection
#### list->有序  set->无序,元素唯一
#### 添加操作: add(Object)->添加一个元素 addAll(Collection)->添加一个集合中所有元素
#### 删除操作: clear()->将集合中的元素清空 remove(obj)->删除集合中指定的元素 remove(collection)->删除集合中的部分元素
#### 判断操作: contains(obj)->集合中包含指定元素 containsAll(collection)->集合中是否包含指定的多个元素 isEmpty()->集合中是否有元素
#### 获取操作: size()->获取集合元素个数
#### 取交集:  retailAll(Collection) ->对当前集合中保留的指定集合中的相同的元素。如果两个集合相同，返回false,如果修改了当前集合返回true
#### 获取所有元素: Iterator  iterator():迭代器
#### 将集合变成数组: toArray()
------

### List
#### ArrayList:底层的数据结构是数组，线程不同步 查询速度快
#### LinkedList:底层数据结构是链表.线程不同步 增删速度快
#### Vector: 底层数据结构是数组，线程同步， 查询和增删都满
#### 添加操作:add(index, element):在指定的索引位插入元素 addAll(index,collection):在指定的位置插入一堆元素
#### 删除操作:remove(index) 删除指定索引位置的元素。返回被删除的元素
#### 获取操作:get(index)->通过索引获取指定元素  indexOf(obj)->获取指定元素第一次出现的索引位置 lastIndexOf(obj)->反向索引指定元素位置 subList(start, end)->获取子列表
#### 修改操作:set(index,element)对指定索引位元素进行修改
#### 获取所有元素: ListIterator listIterator() list集合特有迭代器
#### list利用角标进行遍历
#### ConcurrentModificationException 解决ListIterator it = list.listIterator;//取代 Iterator it = list.iterator;
------

### Set
#### HashSet:底层数据结构是哈希表 线程不同步。无序。高效
#### HashSet如何保证元素唯一性:通过元素的HashCode方法和equal方法完成。 1当元素的hashCode值相同时，才继续equal比较 2如果不相同。就不equal
#### LinkedHastSet:有序 hashset子类
#### TreeSet:对Set集合中的元素进行指定顺序的排序 不同步 底层数据结构二叉树
#### TreeSet ClassCastException (元素不具备比较性) 需要元素实现Comparable接口 复写compareTo方法
#### TreeSet方法保证元素唯一性的方式 就是参考比较方法的结果是否为0 注意:在进行比较时，如果判断元素不唯一，比如同姓名 同年龄才能视为同一个人。此时要分清主次条件主要条件相同时再判断次要条件，依照条件进行排序
#### TreeSet排序有两种方法 comparable和comparator区别
#### 1.让元素自身具备比较性,需要元素对象实现Comparable接口，覆盖compareTo方法
#### 2.让集合自身具备比较性,需要定义一个Conparator接口的比较器,并覆盖compare方法 ,并将该类对象作为实际参数传递给TreeSet集合的构造方法
------

### Map
#### Hashtable:底层是哈希表数据结构,线程同步,不可以存储null键 null值
#### HashMap: 底层是哈希表数据结构,线程不同步可以存储null键null值 
#### TreeMap:底层是二叉树结构,可以对Map集合中的键进行指定顺序的排序。
#### map和collection区别 1一个是元素 一个是键值对 2collection是单列集合 map是双列集合 
#### 添加操作:put(key, value)当存储的键相同时，新的值会替换老的值并将老值返回，如果键没有重复则返回null putAll(Map)
#### 删除操作: clear()清空 remove(key) 删除指定键
#### 判断操作: isEmpty() containsKey(key) 是否包含key  containsValue(value) 是否包含value
#### 取值操作: size() get(key) values()
#### map转成set的方法1
	Set keySet = map.keySet();
	Iterator it = keySet.iterator();
	while(it.hasNext()){
	Object key = it.next();
	Object value = map.get(key_;
	System.out.println(key+":"+value);
	}
#### map转成set方法2
	Set entrySet = map.entrySet();
	Iterator it = entrySet.iterator();
	while(it.hasNext()){
	map.Entry me = (Map.Entry) it.next();
	System.out.println(me.getKey()+"::::"+me.getValue());
	}
#### 使用增强for遍历set的两种方法	

------

# 以下内容为复制粘贴 因为暂时我只是为了做面试题。后期会好好整的嘿嘿

### 使用集合技巧
	看到Array就是数组结构，有角标，查询速度很快。
	看到link就是链表结构：增删速度快，而且有特有方法。addFirst； addLast； removeFirst()； removeLast()； getFirst()；getLast()；
	看到hash就是哈希表，就要想要哈希值，就要想到唯一性，就要想到存入到该结构的中的元素必须覆盖hashCode，equals方法。
	看到tree就是二叉树，就要想到排序，就想要用到比较。
	比较的两种方式：
	一个是Comparable：覆盖compareTo方法；
	一个是Comparator：覆盖compare方法。
	LinkedHashSet，LinkedHashMap:这两个集合可以保证哈希表有存入顺序和取出顺序一致，保证哈希表有序。
	集合什么时候用？
	当存储的是一个元素时，就用Collection。当存储对象之间存在着映射关系时，就使用Map集合。
	保证唯一，就用Set。不保证唯一，就用List。
------
 
### Collections：它的出现给集合操作提供了更多的功能。这个类不需要创建对象，内部提供的都是静态方法。
静态方法：
Collections.sort(list);//list集合进行元素的自然顺序排序。
Collections.sort(list,new ComparatorByLen());//按指定的比较器方法排序。
class ComparatorByLen implements Comparator<String>{
public int compare(String s1,String s2){
int temp = s1.length()-s2.length();
return temp==0?s1.compareTo(s2):temp;
}
}
Collections.max(list); //返回list中字典顺序最大的元素。
int index = Collections.binarySearch(list,"zz");//二分查找，返回角标。
Collections.reverseOrder();//逆向反转排序。
Collections.shuffle(list);//随机对list中的元素进行位置的置换。
将非同步集合转成同步集合的方法：Collections中的  XXX synchronizedXXX(XXX);
List synchronizedList(list);
Map synchronizedMap(map);
原理：定义一个类，将集合所有的方法加同一把锁后返回。
Collection 和 Collections的区别：
Collections是个java.util下的类，是针对集合类的一个工具类,提供一系列静态方法,实现对集合的查找、排序、替换、线程安全化（将非同步的集合转换成同步的）等操作。
Collection是个java.util下的接口，它是各种集合结构的父接口，继承于它的接口主要有Set和List,提供了关于集合的一些操作,如插入、删除、判断一个元素是否其成员、遍历等。
------
	
###Arrays：
用于操作数组对象的工具类，里面都是静态方法。
asList方法：将数组转换成list集合。
String[] arr = {"abc","kk","qq"};
List<String> list = Arrays.asList(arr);//将arr数组转成list集合。
将数组转换成集合，有什么好处呢？用aslist方法，将数组变成集合；
可以通过list集合中的方法来操作数组中的元素：isEmpty()、contains、indexOf、set； 
注意（局限性）：数组是固定长度，不可以使用集合对象增加或者删除等，会改变数组长度的功能方法。比如add、remove、clear。（会报不支持操作异常UnsupportedOperationException）；
如果数组中存储的引用数据类型，直接作为集合的元素可以直接用集合方法操作。
如果数组中存储的是基本数据类型，asList会将数组实体作为集合元素存在。
集合变数组：用的是Collection接口中的方法：toArray();
如果给toArray传递的指定类型的数据长度小于了集合的size，那么toArray方法，会自定再创建一个该类型的数据，长度为集合的size。
如果传递的指定的类型的数组的长度大于了集合的size，那么toArray方法，就不会创建新数组，直接使用该数组即可，并将集合中的元素存储到数组中，其他为存储元素的位置默认值null。
所以，在传递指定类型数组时，最好的方式就是指定的长度和size相等的数组。
将集合变成数组后有什么好处？限定了对集合中的元素进行增删操作，只要获取这些元素即可。

# 以上内容为传智播客整理 代码实现为网上收集和自己整理。

