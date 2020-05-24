package demo05.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class runPerson {

    public static void main(String[] args) {
        //create arrays of Person
        Person[] persons = {
                new Person("John Doe", 40),
                new Person("Jane Smith", 30),
                new Person("Bob", 18)
        };

        //sort array
//        Arrays.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });


        //use lambda
        Arrays.sort(persons, (Person o1, Person o2) ->{
                return o1.getAge() - o2.getAge();
        });



        //scan through array
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
