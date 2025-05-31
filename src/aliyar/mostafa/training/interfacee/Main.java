package aliyar.mostafa.training.interfacee;


public class Main {
    public static void main(String[] args) {
        Nameable nameable = new Student();
        System.out.println(nameable.getName());
        Nameable no = new Person();
        String namePerson = no.getName();
        String nameStudent = nameable.getName();
        CanTack student = new Student();
        student.tack();
        Student student2 = new Student();
        student2.tack();// متد ها طبق قانون پلیفرمیس از پایین ترین کلاسی که override شدن اجرا میشن
        CanTack tack = new CanTack() {// ایجاد کلاس یک بار مصرف از روی اینترفیس نوجه(از روی interface نمیشه ابجکتی ایجاد کرد)
            @Override
            public void tack() {
                System.out.println("I Can tack");
            }

            @Override
            public void think() {
                System.out.println("I think to tack");
            }

        };
        tack.think();
        tack.tack();

    }
    // شما میتوانید داخل یک کلاس، اینرفیس یا کلاس یا انیم ایجاد کنید
    // که میزان دسترسی داخلش میتونید تعریف کنید
    // همچونین میتونید اون رو فاینال کنید که ازش زیر کلاسی ساخته نشه
    // ویا استاتیک تعریف کنید تا بتواند از پرامتر های استاتیک استفاده کند
    // بدیهی است که تمام ویژگی کلاس ها نیز قابل استفاده میشباشد
    private class InnerClass {
        String Massage = "I am inner class";
        InnerClass(String name) {
            System.out.println("I am inner class");
            Massage = name;
        }
        public String getMassage() {
            return Massage;
        }
        public void setMassage(String massage) {
            Massage = massage;
        }
    }
}
