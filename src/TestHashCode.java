public class TestHashCode {
    
    public static void main(String[] args) throws InterruptedException {
       
       String str1 = "111";
       String str2 = "222";
       String str3 = "111";
       System.out.println(str1.hashCode());
       System.out.println(str2.hashCode());
       System.out.println(str3.hashCode());
    }
    
}
