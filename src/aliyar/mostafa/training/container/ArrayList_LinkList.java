package aliyar.mostafa.training.container;

import java.util.*;

public class ArrayList_LinkList {
    public static Scanner scanner = new Scanner(System.in);
    // تفاوت این دو فقط در پرفورمنس اجرا میباشد
    // زمانی که میخواهیم به صورت تصادفی دست پیدا کنیم به متغیر ها آرایه بهتر است
    // زمانی که بیشترن استفاده اول یا آخر لیست هست لینک بهتر است
    //public static List<Integer> list = new ArrayList<>();// با آرایه کار میکنه
    public static List<Integer> list = new LinkedList<>();// با ارجا به بعدی و قبلی ذخیره میکنه
    public static void main(String[] args) {
        fillArrayList();
        questionForSort(list , scanner);
    }

    private static void fillArrayList() {
        boolean flag = true;
        if (flag) {
            getIntegerForList(list,scanner);
            System.out.println("Do you have another number?");
            System.out.println("1) NO");
            System.out.println("2) YES");
            int value = scanner.nextInt();
            if (value== 1) {
                flag = false;
            } else if (value == 2) {
                fillArrayList();
            }else {
                System.out.println("Invalid number");
                fillArrayList();
            }
        }


    }

    private static void questionForSort(List<Integer> list , Scanner scanner) {
        System.out.println("Ascending or descending sort?");
        System.out.println("1) ASC");
        System.out.println("2) DESC");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                list.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });
                break;
            case 2:
                list.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        questionForSort(list , scanner);
    }

    private static void getIntegerForList(List<Integer> list, Scanner scanner) {
        System.out.print("Enter number: ");
        list.add(scanner.nextInt());
    }
}
