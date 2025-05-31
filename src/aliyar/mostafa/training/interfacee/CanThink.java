package aliyar.mostafa.training.interfacee;

public interface CanThink {
    default void think(){// از بعد از ورژن 8 جاوا شما میتوانید برای متد ها دیفالت بذارید
        System.out.println("Think");
    }
}
