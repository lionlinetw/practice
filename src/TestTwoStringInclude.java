import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Person;

public class TestTwoStringInclude {
    public static void main(String[] args) {
//        String mail = "@brillnics";
//        List<String> excludeDomainName = Arrays.asList("wtmec.com", "nuvision-tech.com", "morrihan.com",
//                        "maxtek.icrep.com.tw", "brillnics.com", "hongtech.com.tw", "techmosa.com.tw");
//
//        if (mail != null && mail.contains("@") && mail.split("@").length > 1
//                        && excludeDomainName.contains(mail.split("@")[1])) {
//            System.out.println("in");
//        } else {
//            System.out.println("out");
//        }
        
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);

        }
    }
    
}
