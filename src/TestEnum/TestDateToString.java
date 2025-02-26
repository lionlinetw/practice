package TestEnum;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateToString {
    public static void main(String[] args) {
        Date date = new Date();   
        System.out.println(date);
        
        //Timestamp ts= new Timestamp(date.getTime());
        System.out.println(date.getTime());
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd"); 
        System.out.println(formatter.format(date.getTime()));
    }
}
