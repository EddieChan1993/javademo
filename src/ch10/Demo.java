package ch10;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

/**
 */
public class Demo {
    public static void main(String[] args) {
        double d = 42.5;
        System.out.println(""+d);//+是Java中唯一有重载过的运算符
        System.out.println(Double.toString(d));

        double a = Double.parseDouble("420.23");
        int x = Integer.parseInt("2");

        //格式化数据
        System.out.println(String.format("%,d", 1000000000));//%和d不是两项参数，只是中格式而已
        System.out.println(String.format("I hava %.2f bugs to fix",476578.09876));
        System.out.println(String.format("I hava %,.2f bugs to fix", 476578.09876));
        //format(%,6.1f,42.000)
        //,【flags】-特定类型
        //6【width】-最小的字符数，注意，这不是总数；输出可以超过此
        //。1【precious】-精度
        //type 类型标识

        //时间
        System.out.println(new Date());
        Date data = new Date();
        System.out.println(String.format("%tA,%<tB %<td",data));//<，告诉格式化程序重复利用之前用过的参数
        System.out.println(String.format("%tr", new Date()));

        Calendar cal = Calendar.getInstance();
        cal.set(2004, 1, 7, 15, 40);//获取指定时间
        System.out.println(cal.getTime());

        long day1 = cal.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        cal.setTimeInMillis(day1);//将c的时间加上一个小时
        System.out.println("new Hour " + cal.get(cal.HOUR_OF_DAY));//
        // DATE-每月的几号，HOUR-小时，MILLISECOND-毫秒，MINUTE-分钟，MONTH-月份，YEAR-年份，ZONE_OFFSET-时区位移

        cal.add(cal.DATE, 35);//加上35天
        System.out.println("add 35 days " + cal.getTime());

        cal.roll(cal.DATE, 35);//滚动35天，注意：只是日期字段会动，月份不会动
        System.out.println("roll 35 days " + cal.getTime());

        cal.set(cal.DATE, 1);
        System.out.println("set to 1 "+ cal.getTime());
    }
}