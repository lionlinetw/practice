package TestEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        int qty = 2;
        BigDecimal sapAmount = new BigDecimal(2);
        BigDecimal rate = new BigDecimal(1);
        System.out.println(rate);
//        BigDecimal price = sapAmount.divide(new BigDecimal(qty), 2, RoundingMode.HALF_UP).divide(rate, 2, RoundingMode.HALF_UP);;
//        System.out.println(price);
//        price= price.divide(rate, 2, RoundingMode.HALF_UP);
//        
        BigDecimal price = sapAmount.divide(new BigDecimal(qty), 2, RoundingMode.HALF_UP)
                        .divide(rate, 2, RoundingMode.HALF_UP).stripTrailingZeros();
        
        System.out.println(price);
        
        
        Long l = 0L;
        if (l.longValue() == 0L) {
            System.out.println("Long zero");
        } else {
            System.out.println("Long not");
        }
    }
}
