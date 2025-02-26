import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import bean.Person;

public class TestClass {
    
    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Person person = new Person();
        
        person.setAge(1);
        person.setCreateDate(new Date());
        
//      System.out.println("DeliveryTo : " +  backup.getClass().getField("DELIVERY_TO"));
      
//      Field field = ShipmentHeaderBackup.class.getDeclaredField("DELIVERY_TO");
//      field.setAccessible(true);
      
      Method method  = person.getClass().getMethod("getCreateDate", null);
      Object value = method.invoke(person);
      System.out.println(method.getReturnType().cast(value));

      System.out.println("DeliveryTo : " + value);
      System.out.println("method.getReturnType() : " + method.getReturnType());
      System.out.println("method.getReturnType() : " + method.getReturnType().equals("class java.util.Date"));
      System.out.println("method.getReturnType() : " + method.getReturnType().toString().equals("class java.util.Date"));
      System.out.println("method.getName() : " + method.getName());
      System.out.println("method.getParameterCount() : " + method.getParameterCount());
      System.out.println("person.getClass().getFields() : " + person.getClass().getFields());
      
      Field field  = person.getClass().getDeclaredField("createDate");
      System.out.println("field.getType() : " + field.getType());
      
    }
    
    
}
