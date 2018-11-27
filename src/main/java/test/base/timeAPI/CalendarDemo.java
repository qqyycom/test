package test.base.timeAPI;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
//        CalendarDemo.CalendarGetTime();
        NewTimeApi();
    }

    private static void CalendarGetTime(){
        // 获取今天的前一天的时间,格式为yyyy-MM-dd HH:mm:ss
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cal.getTime());
        System.out.println(date);
    }

    private static void NewTimeApi(){
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取当前时间的前一天
        LocalDateTime yesterday = LocalDateTime.now().plusDays(-1);
        System.out.println(yesterday);

        // 使用格式化函数
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(yesterday));
    }
}
