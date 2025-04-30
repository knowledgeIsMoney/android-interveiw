#位运算
|或，&与，^异或，<<右移，>>左移（补符号位，0补0,1补1），>>>无符号右移（永远补0），同或使用异或取反!(a^b)

#String
new String(arr , 1 , arr.length-1);

#Char
Character.isLetterOrDigit    		char 判断是不是字母数字  
Character.toLowerCase       	char 转小写  
char[] arr = s.toCharArray();      String 转 char数组 map putifabsent   可以在没有的时候推默认值

#Array
Arrays.sort(nums);			数组排序 

Queue
-----------------
* Boolean offer() – 如果可能，将一个新元素插入队列
* Boolean add(E e) – 如果可能，将一个新元素插入队列。如果成功则返回 true，如果没有空间则抛出 IllegalStateException。
* Object poll() – 从 的头部检索并删除一个元素。如果队列为空，则返回 null。
* Object remove() – 从队列头部检索并删除一个元素。
* Object peek() – 检索但不从队列头部移除元素。如果队列为空，则返回 null。
* Object element() – 检索但不从队列头部移除元素
Queue 和 Stack 数据结构都可以用LinkedList实现



StringBuilder 方法
-----------------
StringBuilder	append​(boolean b)	
将 boolean参数的字符串表示形式追加到序列中。

StringBuilder	append​(char c)	
将 char参数的字符串表示形式追加到此序列。

StringBuilder	append​(char[] str)	
将 char数组参数的字符串表示形式追加到此序列。

StringBuilder	append​(char[] str, int offset, int len)	
将 char数组参数的子数组的字符串表示形式追加到此序列。

StringBuilder	append​(double d)	
将 double参数的字符串表示形式追加到此序列。

StringBuilder	append​(float f)	
将 float参数的字符串表示形式追加到此序列。

StringBuilder	append​(int i)	
将 int参数的字符串表示形式追加到此序列。

StringBuilder	append​(long lng)	
将 long参数的字符串表示形式追加到此序列。

StringBuilder	append​(CharSequence s)	
将指定的字符序列追加到此 Appendable 。

StringBuilder	append​(CharSequence s, int start, int end)	
将指定的 CharSequence序列追加到此序列。

StringBuilder	append​(Object obj)	
追加 Object参数的字符串表示形式。

StringBuilder	append​(String str)	
将指定的字符串追加到此字符序列。

StringBuilder	append​(StringBuffer sb)	
将指定的 StringBuffer追加到此序列。

StringBuilder	appendCodePoint​(int codePoint)	
将 codePoint参数的字符串表示形式追加到此序列。

int	capacity()	
返回当前容量。

char	charAt​(int index)	
返回指定索引处的此序列中的 char值。

IntStream	chars()	
返回 int的流，对此序列中的 char值进行零扩展。

int	codePointAt​(int index)	
返回指定索引处的字符（Unicode代码点）。

int	codePointBefore​(int index)	
返回指定索引之前的字符（Unicode代码点）。

int	codePointCount​(int beginIndex, int endIndex)	
返回此序列的指定文本范围内的Unicode代码点数。

IntStream	codePoints()	
返回此序列中的代码点值流。

int	compareTo​(StringBuilder another)	
StringBuilder字典顺序比较两个 StringBuilder实例。

StringBuilder	delete​(int start, int end)	
删除此序列的子字符串中的字符。

StringBuilder	deleteCharAt​(int index)	
按此顺序删除指定位置的 char 。

void	ensureCapacity​(int minimumCapacity)	
确保容量至少等于指定的最小值。

void	getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)	
将字符从此序列复制到目标字符数组 dst 。

int	indexOf​(String str)	
返回指定子字符串第一次出现的字符串中的索引。

int	indexOf​(String str, int fromIndex)	
从指定的索引处开始，返回指定子字符串第一次出现的字符串中的索引。

StringBuilder	insert​(int offset, boolean b)	
将 boolean参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, char c)	
将 char参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, char[] str)	
将 char数组参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int index, char[] str, int offset, int len)	
将 str数组参数的子数组的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, double d)	
将 double参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, float f)	
将 float参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, int i)	
将第二个 int参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int offset, long l)	
将 long参数的字符串表示形式插入此序列中。

StringBuilder	insert​(int dstOffset, CharSequence s)	
将指定的 CharSequence插入此序列。

StringBuilder	insert​(int dstOffset, CharSequence s, int start, int end)	
将指定的 CharSequence序列插入此序列。

StringBuilder	insert​(int offset, Object obj)	
将 Object参数的字符串表示形式插入此字符序列中。

StringBuilder	insert​(int offset, String str)	
将字符串插入此字符序列。

int	lastIndexOf​(String str)	
返回指定子字符串最后一次出现的字符串中的索引。

int	lastIndexOf​(String str, int fromIndex)	
返回指定子字符串最后一次出现的字符串中的索引，从指定索引开始向后搜索。

int	length()	
返回长度（字符数）。

int	offsetByCodePoints​(int index, int codePointOffset)	
返回此序列中的索引，该索引从给定的 index偏移 codePointOffset代码点。

StringBuilder	replace​(int start, int end, String str)	
使用指定的 String的字符替换此序列的子字符串中的字符。

StringBuilder	reverse()	
导致此字符序列被序列的反向替换。

void	setCharAt​(int index, char ch)	
指定索引处的字符设置为 ch 。

void	setLength​(int newLength)	
设置字符序列的长度。

CharSequence	subSequence​(int start, int end)	
返回一个新的字符序列，它是该序列的子序列。

String	substring​(int start)	
返回一个新的 String ，其中包含此字符序列中当前包含的字符的子序列。

String	substring​(int start, int end)	
返回一个新的 String ，其中包含当前包含在此序列中的字符的子序列。

void	trimToSize()	
尝试减少用于字符序列的存储空间。

StringBuffer 方法
-----------------
1	public StringBuffer append(String s)
将指定的字符串追加到此字符序列。

2	public StringBuffer reverse()
 将此字符序列用其反转形式取代。

3	public delete(int start, int end)
移除此序列的子字符串中的字符。

4	public insert(int offset, int i)
将 int 参数的字符串表示形式插入此序列中。

5	insert(int offset, String str)
将 str 参数的字符串插入此序列中。

6	replace(int start, int end, String str)
使用给定 String 中的字符替换此序列的子字符串中的字符。

序号	方法描述
1	int capacity()
返回当前容量。

2	char charAt(int index)
返回此序列中指定索引处的 char 值。

3	void ensureCapacity(int minimumCapacity)
确保容量至少等于指定的最小值。

4	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
将字符从此序列复制到目标字符数组 dst。

5	int indexOf(String str)
返回第一次出现的指定子字符串在该字符串中的索引。

6	int indexOf(String str, int fromIndex)
从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。

7	int lastIndexOf(String str)
返回最右边出现的指定子字符串在此字符串中的索引。

8	int lastIndexOf(String str, int fromIndex)
返回 String 对象中子字符串最后出现的位置。

9	int length()
 返回长度（字符数）。

10	void setCharAt(int index, char ch)
将给定索引处的字符设置为 ch。

11	void setLength(int newLength)
设置字符序列的长度。

12	CharSequence subSequence(int start, int end)
返回一个新的字符序列，该字符序列是此序列的子序列。

13	String substring(int start)
返回一个新的 String，它包含此字符序列当前所包含的字符子序列。

14	String substring(int start, int end)
返回一个新的 String，它包含此序列当前所包含的字符子序列。

15	String toString()
返回此序列中数据的字符串表示形式。
