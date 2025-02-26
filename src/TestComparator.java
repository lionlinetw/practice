import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Person;

public class TestComparator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.setAge(2);
        list.add(p1);

        Person p2 = new Person();
        p2.setAge(0);
        list.add(p2);

        Person p3 = new Person();
        p3.setAge(1);
        list.add(p3);
        System.out.println("--in main Orig list memory");
        System.out.println(list);
        list.forEach(l->System.out.println("Age : " + l.getAge() + ", Name : " + l.getName()));
        list.stream().map(Person::getName).collect(Collectors.toList());
        orderByAge(list);
//        list = orderByAge(list);
        
        System.out.println("--in main after orderByAge list memory");
        System.out.println(list);
        list.forEach(l->System.out.println("Age : " + l.getAge() + ", Name : " + l.getName()));
    }

    public static List<Person> orderByAge(List<Person> list) {

        System.out.println("--in orderByAge method before sort");
        System.out.println(list);
        list.forEach(l->System.out.println("Age : " + l.getAge() + ", Name : " + l.getName()));
        
        list.get(2).setName("Lucien");
        list = list.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        
        System.out.println("--in orderByAge method After sort");
        System.out.println(list);
        list.forEach(l->System.out.println("Age : " + l.getAge() + ", Name : " + l.getName()));
        
        return list;
    }

}
