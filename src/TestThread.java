public class TestThread {
    
    public static void main(String[] args) throws InterruptedException {
       
        Thread worker = new Thread(() -> {
            try {
                System.out.println("worker start ");
                Thread.sleep(1000);
                System.out.println("worker complete ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread test = new Thread(() -> {
            try {
                System.out.println("test start ");
                Thread.sleep(1000);
                System.out.println("test complete ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
//        worker.start();
//        test.start();
        
        worker.run();
        test.run();
        
//        worker.join();
//        test.join();
        System.out.println("end");
    }
    
    
}
