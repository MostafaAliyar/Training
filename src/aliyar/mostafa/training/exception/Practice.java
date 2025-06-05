package aliyar.mostafa.training.exception;

import java.io.IOException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        try {
            f(0);
            g(2);
            g(-4);
        }catch (IOException ex){//  نمیتوان اکسپشن زیر کلاس رو بعد از ساب کلاس تعریف کرد چون بی معنی میشه و هیچوقت اچار نمیشه ولی برعکسش میشه
            System.out.println(ex.getMessage());
        } catch (Exception exp) {//میتوانید کلاس بالاتر رو فراخانی کنید یا به تفکیک کلاس ها catch بسازید
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        // ابن بخش به هر حال اجرا میشه و معمولا برای آزاد کردن منابعی استفاده میشه که توسط خود گوگل آزاد نمیشه
        // حتی بدون داشتن catch میتونید از فاینالی استفاده کرد ولی مرسوم نیست
        finally {
            System.out.println("End");
        }
        //---------------------------------------------------------------//
        //فرقی بین این کد و کد پاینی وجود نداره
        Scanner scanner = new Scanner(System.in);
        try {
            String name =scanner.next();
        }finally {
            scanner.close();
        }
        try (Scanner sc = new Scanner(System.in)) {// در این حالت دیگه نیاز نیست منابع رو از طریق finally ببندیم خودش میفهمه باید ببنده
            String name = sc.next();
        }
        //--------------------------------------------------------------//
    }

    private static void g(int i) throws Exception {
        if (i < 0) {
//            throw new Exception("Negative Number");
            Exception ex = new Exception();
            throw ex;
        }
    }

    private static void f(int i) throws MyException, IOException {// میتوانید هر تعداد اکسپشن رو پاس بکنید یا حتی کلاس والد پاس بکنید
        if (i==0){
            throw new MyException("ziro");
        } else if (i>0) {
            throw  new IOException("Negative Number");
        }else {
            System.out.println(i);
        }
    }
    // کلاس ها و زیر کلاس های Error , RuntimeException نیاز به تصریح ندارن و میتونی براش throws نذاری
    // اما در عملکرد سیستم هیچ فرقی ایجاد نمیکنه
    private static  void  x( int i){
        System.out.println(i);
        throw new RuntimeException("run time exception");
    }
    static class MyException extends Exception {
        MyException() {
            super();
        }
        MyException(String message) {
            super(message);
        }
    }
    class SuperClass {
        public void f() throws Exception {
            System.out.println("SuperClass");
            Exception exception = new Exception();
            throw exception;
        }
    }
    class SubClass extends SuperClass {
        // در زیر کلاس نمیتوانید به کلاس های بالاتر کست کنیم و فقط میتونیم مساوی یا کمترش کنیم
        @Override
        public void f() /*throws Throwable */{
            System.out.println("SubClass");

        }
    }


}
