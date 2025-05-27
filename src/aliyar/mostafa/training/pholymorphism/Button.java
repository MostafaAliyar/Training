package aliyar.mostafa.training.pholymorphism;

public class Button extends Component {
    public Button(int width, int height) {
        super(width, height);
    }

    @Override
    public void show() {
        System.out.println("_____________________________________");
        System.out.println("Button will be shown");
        System.out.println("Width is: "+getWidth());
        System.out.println("Height is: "+getHeight());
    }
}
