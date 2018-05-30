# java中必须了解的常用类
## java中的包装类
为何有包装类的出现？
基本数据类型不具备对象的特性，比如基本类型不能调用方法、功能简单。
为了让基本数据类型也具备对象的特性， Java 为每个基本数据类型都提供了一个包装类，这样就可以像操作对象那样来操作基本数据类型。 
每个基本类型都有相对应的包装类
基本类型　	包装器类型
boolean	   Boolean
char	   Character
int	   Integer
byte	   Byte
short	   Short
long	   Long
float	   Float
double	   Double
包装类主要提供了两大类方法：
1. 将本类型和其他基本类型进行转换的方法
2. 将字符串和本类型及包装类互相转换的方法

## Date类和SimpleDateFormat
在程序开发中，经常需要处理日期和时间的相关数据，此时可以使用 java.util 包中的 Date 类
这个类最主要的作用就是获取当前时间，我们来看下 Date 类的使用： 
Date d = new Date();//使用默认的构造方法创建Date对象 
System.out.println(d);//输出Date对象
SimpleDateFormat 来对日期时间进行格式化，如可以将日期转换为指定格式的文本，也可将文本转换为日期。

## Calendar 类的应用
java.util.Calendar 类是一个抽象类，可以通过调用 getInstance() 静态方法获取一个 Calendar 对象，此对象已由当前日期时间初始化，即默认代表当前时间，
如 Calendar c = Calendar.getInstance();

## 使用 Math 类操作数据
Math 类位于 java.lang 包中，包含用于执行基本数学运算的方法， Math 类的所有方法都是静态方法，所以使用该类中的方法时，可以直接使用类名.方法名，
如： Math.round();

## String类
　直接赋值方式创建对象是在方法区的常量池
     String str="hello";//直接赋值的方式 
   通过构造方法创建字符串对象是在堆内存
   String str=new String("hello");//实例化的方式 


# 集合详解
定义：Java中的集合类：是一种工具类，就像是容器，存储任意数量的具有共同属性的对象。
作用：
集合可以：
1、在类的内部，对数据进行组织；
2、简单而快速的搜索大数量的条目；
3、有的集合接口，提供了一系列排列有序的元素，并且可以在序列中间快速的插入或者删除元素；
4、有的集合接口，提供了映射关系，可以通过关键字（key）快速的查找到对应的唯一对象，而这个关键字可以是任意类型。
与数组的对比：
1、数组的长度固定，集合长度可变；
2、数组只能通过下标访问元素，下标类型只能是数字型，而有的集合可以通过任意类型查找所映射的具体对象。
Java集合框架的体系结构


Collection接口
1、是List、Set和Queue接口的父接口；
2、定义了可用于操作List、Set和Queue的方法——增删改查；
List接口及其实现类——ArrayList
List（序列），元素有序，并且可重复；
List可以精确控制元素的插入位置，或删除指定位置的元素；
ArrayList——数组序列，是List的一个重要实现类；
ArrayList底层是由数组实现的
泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错。
泛型集合中的限定类型，不能使用基本类型，必须用基本类型的包装类。
Set接口及其实现类——HashSet
Set（集），元素无序，并且不可以重复；
HashSet——哈希集，是Set的一个重要实现类；

Map接口
Map提供了一种映射关系，元素是以键值对（key-value）的形式存储的，能根据key快速查找value；
Map中的键值对以Entry类型的对象实例形式存在；
key值不能重复，value值可以重复；
key对value是多（一）对一的关系；
Map接口提供了返回key值集合、value值集合、Entry值集合，的方法；
Map支持泛型，形式如：Map<K,V>

HashMap类
HashMap是Map的一个重要实现类，也是最常用的，基于哈希表实现；
HashMap中的Entry对象是无序排列的；
Key值和value值都可以为null，但是一个HashMap只能有一个Key值为null的映射（Key值不可重复）；



# 泛型（Generics）
泛型是Java SE 1.5的新特性，泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。
泛型通过在编译时检测到更多的代码 bug 从而使你的代码更加稳定。

## 泛型的作用

概括地说，泛型支持类型（类和接口）在定义类，接口和方法时作为参数。就像在方法声明中使用的形式参数（formal parameters），类型参数提供了一种输入可以不同但代码可以重用的方式。所不同的是，形式参数的输入是值，类型参数输入的是类型参数。

使用泛型对比非泛型代码有很多好处：

* 在编译时更强的类型检查。

如果代码违反了类型安全，Java 编译器将针对泛型和问题错误采用强大的类型检查。修正编译时的错误比修正运行时的错误更加容易。

* 消除了强制类型转换。

没有泛型的代码片需要强制转化：

```
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);
```

当重新编写使用泛型，代码不需要强转：

```
List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast
```

* 使编程人员能够实现通用算法。

通过使用泛型，程序员可以实现工作在不同类型集合的通用算法，并且是可定制，类型安全，易于阅读。

## 泛型类型（Generic Types）

泛型类型是参数化类型的泛型类或接口。下面是一个 Box 类例子来说明这个概念。

### 一个简单的 Box 类

```java
public class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}
```

由于它的方法接受或返回一个 Object，你可以自由地传入任何你想要的类型，只要它不是原始的类型之一。在编译时，没有办法验证如何使用这个类。代码的一部分可以设置 Integer 并期望得到 Integer ，而代码的另一部分可能会由于错误地传递一个String ，而导致运行错误。

### 一个泛型版本的 Box 类

泛型类定义语法如下：

```
class name<T1, T2, ..., Tn> { /* ... */ }
```

类型参数部分用 `<>` 包裹，制定了类型参数或称为类型变量（type parameters or  type variables) T1, T2, ..., 直到 Tn.

下面是代码：

```java
public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
```

主要，所有的 Object 被 T 代替了。类型变量可以是非基本类型的的任意类型，任意的类、接口、数组或其他类型变量。

这个技术同样适用于泛型接口的创建。

### 类型参数命名规范

按照惯例，类型参数名称是单个大写字母，用来区别普通的类或接口名称。

常用的类型参数名称如下：

```
E - Element (由 Java 集合框架广泛使用)
K - Key
N - Number
T - Type
V - Value
S,U,V 等. - 第二种、第三种、第四种类型
```

### 调用和实例化一个泛型

从代码中引用泛型 Box 类，则必须执行一个泛型调用(generic type invocation)，用具体的值，比如 Integer 取代 T ：

```
Box<Integer> integerBox;
```

泛型调用与普通的方法调用类似，所不同的是传递参数是类型参数（type argument ），本例就是传递 Integer 到 Box 类：

*Type Parameter 和 Type Argument 区别*

*编码时，提供  type argument 的一个原因是为了创建 参数化类型。因此，`Foo<T>` 中的 T 是一个 type parameter， 而 `Foo<String>` 中的 String 是一个 type argument*

与其他变量声明类似，代码实际上没有创建一个新的 Box 对象。它只是声明integerBox 在读到 `Box<Integer>` 时，保存一个“Integer 的 Box”的引用。

泛型的调用通常被称为一个参数化类型（parameterized type）。

实例化类，使用 new 关键字：

```
Box<Integer> integerBox = new Box<Integer>();
```

### 菱形（Diamond）

Java SE 7 开始泛型可以使用空的类型参数集`<>`，只要编译器能够确定，或推断，该类型参数所需的类型参数。这对尖括号`<>`，被非正式地称为“菱形（diamond）”。例如：

```
Box<Integer> integerBox = new Box<>();
```

### 多类型参数

下面是一个泛型 Pair 接口和一个泛型 OrderedPair ：

```
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
```

创建两个 OrderedPair 实例：

```
Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
```

代码 `new OrderedPair<String, Integer>`，实例 K 作为一个 String 和 V 为 Integer。因此，OrderedPair 的构造函数的参数类型是 String 和 Integer。由于自动装箱（autoboxing），可以有效的传递一个 String 和 int 到这个类。

可以使用菱形（diamond）来简化代码：

```
OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
```

### 参数化类型

您也可以用 参数化类型（例如，`List<String>`的）来替换类型参数（即 K 或 V ）。例如，使用`OrderedPair<K，V>`例如：

```
OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...));
```

### 原生类型（Raw Types）

原生类型是没有类型参数(type arguments)的泛型类和泛型接口，如泛型 Box 类;

```
public class Box<T> {
    public void set(T t) { /* ... */ }
    // ...
}
```

为了创建
