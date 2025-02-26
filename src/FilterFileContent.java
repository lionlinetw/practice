import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterFileContent {
    public static void main(String[] args) {
//        Path path = Paths.get("D:\\FilterConent\\uat\\resell.log");
//        Path path = Paths.get("D:\\FilterConent\\uat\\resell-mypo.log");
//      Path path = Paths.get("D:\\FilterConent\\uat\\resell-myshipment.log");
//        Path path = Paths.get("D:\\FilterConent\\uat\\resell-mypo-2025-01-10.log");
//      Path path = Paths.get("D:\\FilterConent\\uat\\mro.log");

//          Path path = Paths.get("D:\\FilterConent\\uat\\resell-myshipment-2024-12-23.log");
//        Path path = Paths.get("D:\\FilterConent\\1a\\resell.log");
//        Path path = Paths.get("D:\\FilterConent\\1b\\resell-2025-02-21.log");
//        Path path = Paths.get("D:\\FilterConent\\1b\\localhost_access_log.2025-02-18.txt");
      
//        Path path = Paths.get("D:\\FilterConent\\1a\\resell-2024-01-29.log");
//        Path path = Paths.get("D:\\FilterConent\\wintchSAPAdapter\\recruit.log.2024-01-17_utf8");
        Path path = Paths.get("D:\\FilterConent\\wintech2005\\WintechPOSLogFile.log.2024-11-06_Utf8");

        List<String> matchList = new ArrayList<>();

        
      matchList.add("http://tcs-prod.wtmec.com:8080/tcs/eccn/public/rest/eccn/grandCheck");
//////////        
        matchList.add("US_LICENSE");
////        
        matchList.add("OB");
        matchList.add("K0004521");
////        
      matchList.add("HMC635");
//      matchList.add("210");
//        matchList.add("5343585");
//      matchList.add("9382298");
////      
//      matchList.add("10");
//      matchList.add("2025-02-21T16:51");
//      matchList.add("http-nio-8080-exec-2017");
//      matchList.add("41646");

        



        System.out.println("Start");
        List<String> stringList = getLinesThatContain(path, matchList);

        readToFile(stringList);
        System.out.println("Done");
    }

    public static List<String> getLinesThatContain(Path path, List<String> matchList) {
        List<String> filteredList = null;

        try (Stream<String> stream = Files.lines(path)) {
            // Filtering logic here

            for (int i = 0; i < matchList.size(); i++) {

                if (i == 0) {
                    filteredList = filterContent(stream, matchList.get(i));
                } else {
                    filteredList = filterContent(filteredList.stream(), matchList.get(i));
                }
            }

        } catch (IOException ioe) {
            // exception handling here
        }
        return filteredList;
    }

    public static List<String> filterContent(Stream<String> stream, String match) {
        return stream.filter(line -> line.contains(match)).collect(Collectors.toList());
    }


    public static void readToFile(List<String> list) {
        FileWriter writer;
        try {
            writer = new FileWriter("D:\\FilterConent\\filted.txt");

            for (String str : list) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
