一、概念
java 早期两个版本1.02/1.1
标准版都是java开头的包
标准版的扩展都是javax作为包名称开头

二、问答
1.使用import会把程序变大吗?便宜过程会把包或类包进去吗？
运用import只是帮你省下每个类前面的包名称，不会变大
2.为何我不必import进String类或System类
java.lang是个预先被引用的包，，所以不必引用。
java.lang.String和java.lang.System是独一无二的class,java知道要去哪儿找

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
