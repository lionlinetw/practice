import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestDate {

    public static void main(String[] args) throws ParseException {
        // "updated": "Feb 6, 2025 06:29:26 UTC",
        // "updateduk": "Feb 6, 2025 at 06:29 GMT",
        // "updatedISO": "2025-02-06T06:29:26+00:00"

        String pattern = "yyyy/MM/dd HH:mm:ss";
        // DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd
        // HH:mm:ss");

        utc();
        gtm();
        iso();

    }

    public static void utc() {
        String dateString = "Feb 6, 2025 06:29:26 UTC";
        // 定义输入的日期格式，并设置语言环境为英语
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy HH:mm:ss z", Locale.ENGLISH);
        // 解析字符串为 ZonedDateTime 对象
        ZonedDateTime dateTime = ZonedDateTime.parse(dateString, inputFormatter);
        // 定义输出的日期格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 格式化 ZonedDateTime 对象为字符串
        String formattedDate = dateTime.format(outputFormatter);
        System.out.println(formattedDate);
    }

    public static void gtm() {
        String dateString = "Feb 6, 2025 at 06:29 GMT";
        // 去除字符串中的 " at "，以便解析
        dateString = dateString.replace(" at ", " ");
        // 定义输入的日期格式，并设置语言环境为英语
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy HH:mm z", Locale.ENGLISH);
        // 解析字符串为 ZonedDateTime 对象
        ZonedDateTime dateTime = ZonedDateTime.parse(dateString, inputFormatter);
        // 定义输出的日期格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 格式化 ZonedDateTime 对象为字符串
        String formattedDate = dateTime.format(outputFormatter);
        System.out.println(formattedDate);
    }
    
    public static void iso() {
        String dateString = "2025-02-06T06:29:26+00:00";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);
        // 定义输出的日期格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 格式化 OffsetDateTime 对象为字符串
        String formattedDate = dateTime.format(outputFormatter);
        System.out.println(formattedDate);
    }

}
