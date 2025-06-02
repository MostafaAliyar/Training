package aliyar.mostafa.training.recursive_function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Person> persons;
    static Scanner scanner = new Scanner(System.in);
    public static String familyTree="";

    public static void main(String[] args) {
        createPersons();
        showMenu();

    }

    private static void showMenu() {
        System.out.println("Please select item as menu :");
        System.out.println("1) find people by name");
        System.out.println("2) find people by code");
        System.out.println("3) show people Parents");
//        System.out.println("4) find a common ancestor");
        String name ;
        int code;
                switch (scanner.nextInt()){
            case 1:
                System.out.println("Please enter name : ");
                name= scanner.next();
                findPerson(name);
                showMenu();
                break;
            case 2:
                System.out.println("Please enter code : ");
                code =scanner.nextInt();
                findPerson(code);
                showMenu();
                break;
            case 3:
                System.out.println("Please enter code : ");
                code = scanner.nextInt();
                String familyType =showAllChile(code);
                System.out.println(familyType);
                familyTree="";
                showMenu();
                break;
            /*case 4:
                System.out.println("Please enter first code : ");
                int code1 = scanner.nextInt();
                System.out.println("Please enter second code : ");
                int code2 = scanner.nextInt();
                ancestorPerson(findPerson(code1),findPerson(code2));*/
            default:
                System.out.println("Please enter a valid choice");
                showMenu();
                break;

        }
    }

    /*private static String showAllCiled(int code) {
        for (Person person : persons) {
            if (person.getCodeFather()!=-1){
                if (person.equals(code)) {
                    showAllCiled()
                    familyTree=familyTree+person.getName()+",";
                }
            }
        }
    }*/

    /*private static boolean ancestorPerson(Person person, Person person1) {
        List<Integer> codePerson = new ArrayList<>();
        for (Person person2 : persons) {

        }
    }*/

    private static void findPerson(String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                System.out.println(person.toString());
            }
        }
    }
    private static Person findPerson(int code) {
        for (Person person : persons) {
            if (person.equals(code)) {
                System.out.println(person.toString());
                return person;
            }
        }
        return null;
    }
    private static String showAllChile(int code ) {
        for (Person person : persons) {
            if(person.equals(code)){
                if (person.getCod()!=-1){
                    showAllChile(person.getCodeFather());
                    familyTree = familyTree+" پسر "+person.getName();
                }

            }
        }
        return familyTree;

    }
    private static String showAllParent(int code ) {
        for (Person person : persons) {
            if(person.equals(code)){
                if (person.getCod()!=-1){
                    familyTree = familyTree+" پدر "+person.getName();
                    showAllParent(person.getCodeFather());
                }
                /*if(person.getPerson()!=null){
                    familyTree= familyTree+" پسر "+person.getName();
                    showAllParent(person.getPerson().getCod());
                }*/
            }
        }
        return familyTree;

    }

    private static void createPersons() {
        System.out.println("Please enter the number of peoples you want to train");
        persons = new ArrayList<Person>();
        System.out.println("Please enter the name :");
        String name = scanner.next();
        System.out.println("Please enter the code :");
        int code = scanner.nextInt();
        Person person= new Person(name,code);
        person.setCodeFather(-1);
        persons.add(person);
        haveChile(person);
    }



    private static Person haveChile(Person personMain) {
        System.out.println("Do you have children for "+personMain.getName()+"?:");
        System.out.println("1) Yes");
        System.out.println("2) No");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("please enter the name :");
                String name = scanner.next();
                System.out.println("please enter the code :");
                int code = scanner.nextInt();
                Person person = new Person(name,code);
                person.setCodeFather(personMain.getCod());
                persons.add(person);
                haveChile(person);
                return person;
            case 2:
                if (personMain.getCod()!=-1){
                    for (int i=0; i<persons.size(); i++) {
                        if (persons.get(i).equals(personMain.getCodeFather())){
                            haveChile(persons.get(i));
                        }
                    }
                }
                return personMain;
            default:
                System.out.println("Please enter a valid choice");
                return personMain;

        }
    }
}
