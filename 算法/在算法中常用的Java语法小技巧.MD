
Character.isLetterOrDigit    		char 判断是不是字母数字 
Character.toLowerCase       	char 转小写 
queue.offer  					队列输入对象 
queue.poll					队列取出对象 
LinkedList  实现了queue接口
Arrays.sort(nums);			数组排序
char[] arr = s.toCharArray();      String 转 char数组 map putifabsent   可以在没有的时候推默认值

 Queue 声明了许多方法。作为接口的方法，它们应该在所有实现 Queue 的类中表示。最重要的队列方法，Java： 
* Boolean offer() – 如果可能，将一个新元素插入队列
* Boolean add(E e) – 如果可能，将一个新元素插入队列。如果成功则返回 true，如果没有空间则抛出 IllegalStateException。
* Object poll() – 从 的头部检索并删除一个元素。如果队列为空，则返回 null。
* Object remove() – 从队列头部检索并删除一个元素。
* Object peek() – 检索但不从队列头部移除元素。如果队列为空，则返回 null。
* Object element() – 检索但不从队列头部移除元素

Queue 和 Stack 数据结构都可以用LinkedList实现
