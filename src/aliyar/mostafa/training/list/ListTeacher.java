package aliyar.mostafa.training.list;

import aliyar.mostafa.training.interfacee.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTeacher {
    static Scanner scanner = new Scanner(System.in);
    static List <Person> persons = new ArrayList<Person>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter person name: ");
            Person person = new Person();
            person.setName(scanner.nextLine());
            persons.add(person);
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(i+": "+persons.get(i).getName());
        }
    }

}
