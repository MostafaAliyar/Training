package aliyar.mostafa.training.exception;

import java.util.Scanner;

public class Main {
    private static Person person;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        startCreate(sc);
        sc.close();
    }

    private static void startCreate(Scanner sc) {
        try {
            createPerson(sc);
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
            System.out.println("دوباره سعی کنید");
            startCreate(sc);
        } finally {
            if (person != null) {
                System.out.println(person.toString());
            }
        }
    }

    private static void createPerson(Scanner sc) {
        person = new Person();
        System.out.println("نام را به فارسی وارد کنید: ");
        person.setName(sc.nextLine());
        System.out.println("کد ملی را وارد کنید");
        person.setID(sc.nextLine());
        System.out.println("تاریخ تولد را وارد کنید");
        person.setDate(sc.nextLine());
    }
}
