一、概念
java 早期两个版本1.02/1.1
标准版都是java开头的包
标准版的扩展都是javax作为包名称开头

java内存的占用部分=堆+栈

堆:
对象存活于可垃圾回收的堆上
实例变量(对象状态)存在于所属的对象中
对象活着，实力变量也会是活的
栈:
局部变量+方法参数被声明在方法中，
它们是暂时的。生命周期随着方法的调用完毕而结束,
执行的方法会被堆叠(堆栈块)在一起，当前执行的方法会放在
上一个的上面，当前方法执行完毕就会被释放

对象的生命周期：
取决于引用到它的引用变量。如果引用变量还活着，则对象也会继续活在堆上
而引用变量的生命周期，引用变量取决于局部变量和实例变量的生命周期

如果内存不足，GC(垃圾收集器)就会去歼灭部分或全部的可回收对象。你可能还是会遇到内存
不足的状况，但这要等到所有可回收的都被回收掉也还不够的时候才会发生。你要
注意的是对象用完了就要抛弃，这样GC才可以回收

三种方法可以释放对象的引用
1.引用永久的离开它的范围
void go(){
    Life z=new Life();//z会在方法结束时消失
}
2.引用被赋值到其他对象上
Life z=new Life();
z=new Life();
3.直接将引用设定为null
Life z=new Life();
z=null;

二、问答
1.使用import会把程序变大吗?便宜过程会把包或类包进去吗？
运用import只是帮你省下每个类前面的包名称，不会变大
2.为何我不必import进String类或System类
java.lang是个预先被引用的包，，所以不必引用。
java.lang.String和java.lang.System是独一无二的class,java知道要去哪儿找
3.到底为什么要知道栈和堆的机制？
  因为这对于我们认识对象的建立,内存管理，线程和异常处理很重要

三、
//数组转为字符串
Arrays.toString([1,2])
//字符串转为int
Integer.parseInt("23")


//获取随机字符1~5
(int)(Math.random()*5)
//for循环
for(int i=0;i<5;i++){}
for(String name:nameArray){}
//强制转换
long y=52
int x=(int)y

float a=3.14f;
int x=(int)a

Math.random();
Math.abs(-123.03);
Math.abs(-23);

Math.round(-23.8);
Math.min(12, 34);