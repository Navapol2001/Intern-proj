package collections;

import java.util.Comparator;

public class Family implements Comparator<Family> {
    private String name;
    private Integer age;
    public Family () {}
    public Family (String n, int a) {
       this.name = n;
       this.age = a;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public int compare(Family o1, Family o2) {
        return o1.age.compareTo(o2.age);
    }
    @Override
    public String toString() {
        return '"' + name + '"' + ":" + age;
    }
}
