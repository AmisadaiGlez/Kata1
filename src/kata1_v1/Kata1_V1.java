package kata1_v1;

import java.util.Date;

public class Kata1_V1 {

    public static void main(String[] args) {
        Person person = new Person("Amisadai", new Date(95,4,28));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
