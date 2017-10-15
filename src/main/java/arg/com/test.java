package arg.com;

import arg.com.common.DateFormatUtils;
import arg.com.common.EncryptUtils;
import arg.com.common.UUIDUtils;
import arg.com.enums.DatePatternEnum;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenfeilong on 2017/10/14.
 */
public class test {
    public static  void main(String[] arg){
        test t = new test();
        try {
            t.calendarToTime();
            System.out.println("-------------------------------");
            t.millisToTime();
            System.out.println("--------localDateTime---------");
            t.localTimeToTime();
            System.out.println("--------Instant----------");
            t.instantToTime();
            System.out.println("--------Instant----------");
            t.defauleToTime();
            System.out.println("--------Instant----------");
            t.passWordToMd5();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //日期格式转成指定的日期格式函数，利用枚举类定义所有的格式类型
    public void calendarToTime() throws  Exception{
        System.out.println("普通格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.DATETIME.getValue()));
        System.out.println("年月日格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.DATE.getValue()));
        System.out.println("中文的年月日格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.DATE_ZH.getValue()));
        System.out.println("带有毫秒的完整日期格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.FULL.getValue()));
        System.out.println("中文带有毫秒的完整日期格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.FULL_ZH.getValue()));
        System.out.println("时分秒格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.TIME.getValue()));
        System.out.println("中文时分秒格式："+ DateFormatUtils.format(Calendar.getInstance(), DatePatternEnum.TIME_ZH.getValue()));
        Calendar calender = Calendar.getInstance();
        calender.set(2017,10,14,9,35);
        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.get(Calendar.MONTH));
        System.out.println(calender.get(Calendar.DAY_OF_WEEK));
        switch (calender.get(Calendar.DAY_OF_WEEK)){
            case 1:
                System.out.println("星期天");
                break;
            case 2:
                System.out.println("星期一");
                break;
            case 3:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期三");
                break;
            case 5:
                System.out.println("星期四");
                break;
            case 6:
                System.out.println("星期五");
                break;
            case 7:
                System.out.println("星期六");
                break;

        }
        System.out.println(Calendar.ALL_STYLES);
        System.out.println(Calendar.AM);
        System.out.println(Calendar.AM_PM);
        System.out.println(Calendar.YEAR);
    }
    public void millisToTime() throws  Exception{
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.DATE.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.TIME_ZH.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.TIME.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.FULL_ZH.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.DATETIME.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.FULL.getValue()));
        System.out.println("获取当前的毫秒值："+DateFormatUtils.format(System.currentTimeMillis(),DatePatternEnum.DATE_ZH.getValue()));
    }
    public void localTimeToTime() throws Exception{
        System.out.println("jdk1.8的新日期类："+LocalDateTime.now());
        /*
        * LocalDateTime的使用：
        * 1、它是jdk1.8新增的一个类
        * 2、now（）函数可以获取当前的时间
        * 3、of函数可以去指定年、月、日、时、分、秒从而返回一个LocalDateTime类型
        *
        * */
        System.out.println("localDateTime的of函数使用："+LocalDateTime.of(2017,1,1,1,1));
        System.out.println(DateFormatUtils.format(LocalDateTime.now(),DatePatternEnum.FULL.getValue()));
    }
    public void instantToTime() throws  Exception{
        System.out.println("Instant获取当前的时间:"+Instant.now());
        System.out.println("InstantMAX"+Instant.MAX);
        System.out.println(DateFormatUtils.format(Instant.now(Clock.systemUTC()),DatePatternEnum.FULL.getValue()));
        System.out.println("格式化Instant时间："+DateFormatUtils.format(Instant.now(),DatePatternEnum.FULL.getValue()));
    }
    public void defauleToTime() throws Exception{
        System.out.println("转date"+DateFormatUtils.defaultFormat(new Date()));
        System.out.println("转Calendar"+DateFormatUtils.defaultFormat(Calendar.getInstance().getTime()));
    }
    public void passWordToMd5() throws  Exception{
        System.out.println("不加盐值"+EncryptUtils.md5("cfl,1997"));
        System.out.println("加盐值"+EncryptUtils.md5("cfl,1997","CFL,1997"));
        System.out.println("自动生成UUID字符"+UUIDUtils.uuid());
    }
}
