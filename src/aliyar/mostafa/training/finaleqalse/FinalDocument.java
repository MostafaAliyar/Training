package aliyar.mostafa.training.finaleqalse;

import java.util.Scanner;

public class FinalDocument {
    private final int number = 15;// زمانی که یک متغیر primitive تعریف میکنیم مقدار آن را نمیشود تغیر داد
    private static final Person personMain = new Person("mostafa",28,19859252);// زمانی که یک شی ایجاد میکنیم ارجاع به اون شی رو نمیشه تغییر داد
    private static final Scanner scanner= new Scanner(System.in);// زمانی که یک شی ایجاد میکنیم ارجاع به اون شی رو نمیشه تغییر داد

    public static void main(String[] args) {// برای OverWrite کردن تابع equalise در کلاس Person
        System.out.println("لطفا نام کاربر را وارد کنید!");
        String name = scanner.next();
        System.out.println("لطفا سن کاربر را وارد کنید");
        int age = scanner.nextInt();
        System.out.println("لطفا کد ملی کاربر را وارد کنید.");
        int cod = scanner.nextInt();
        Person person = new Person(name, age, cod);
        if( person.equals(personMain)){
            System.out.println("Hello Word!");
        }else {
            System.out.println("Bay Word!");

        }

    }
    private final void method(){// زمانی که یک متد را final کنید دیگر نمیتواید آنرا override کنید
        System.out.println(number);
    }
    //@Override
    // ولی میشه Overload کرد.
    private final void method(int i){
        System.out.println(i);
    }
    private final class ClassMain {
        // زمانی که یک کلاس رو final کنیم دیگه نمیشه ازش زیر کلاس ساخت
    }
    /*private class subClass extends ClassMain{

    }*/
}
