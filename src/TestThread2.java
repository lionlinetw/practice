import java.util.ArrayList;
import java.util.List;

public class TestThread2 {
    
    public static void main(String[] args) throws InterruptedException {
        
        int maxSize = 10000;
        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i < maxSize; i++) {
            valueList.add(i);
        }
        
        List<Thread> threadList = new ArrayList<>();

        int range = maxSize / 3;
        
        System.out.println("range " + range);
        
        int start = 0;
        int end = range;
        for (int i = 0; i < 3; i++) {
            threadList.add(createThread(start, end));
            
            start = start + range;
            end = end + range;
            
            if (i == 1) {
                end = maxSize;
            }
        }
        
        for (Thread thread : threadList) {
            System.out.println(thread.getName());
            thread.start();

        }
        
        for (Thread thread : threadList) {
            thread.join();
        }
        
      

        System.out.println("finish");
    }
    
    public static Thread createThread(int start, int end) {
        return new Thread(() -> {
            printMessage(start, end);
        });
    }
    
//    public synchronized static void printMessage(int start, int end) {
        public static void printMessage(int start, int end) {

        System.out.println("test start " + start);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("test complete " + end);
    }
    
    
}
