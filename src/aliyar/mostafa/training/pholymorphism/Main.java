package aliyar.mostafa.training.pholymorphism;

import java.util.Scanner;

public class Main {
    private static final Component[] components = new Component[10];
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0 ; i < components.length ; i++) {
            System.out.println("Please select component: " );
            System.out.println("1) TextBox " );
            System.out.println("2) Button" );
            switch (scanner.nextInt()) {
                case 1:
                    createTextBox(i);
                    break;
                case 2:
                    createButton(i);
                    break;
                default:
                    System.out.println("Error Please try again " );
                    break;
            }
        }
        for (Component component : components) {
            if (component != null) {
                component.show();
            }
        }
    }

    private static void createButton(int i) {
        System.out.println("Button is selected");
        System.out.println("Please set width button");
        int width = scanner.nextInt();
        System.out.println("Please set height button");
        int height = scanner.nextInt();
        components[i]=new Button(width,height);
    }

    private static void createTextBox(int index) {
        System.out.println("TextBox is selected");
        System.out.println("Please set width textbox");
        int width = scanner.nextInt();
        System.out.println("Please set height textbox");
        int height = scanner.nextInt();
        components[index]=new TextBox(width,height);
    }
}