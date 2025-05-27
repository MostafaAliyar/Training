package aliyar.mostafa.training.pholymorphism;


public abstract class Component {
    private int width;
    private int height;
    public Component(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public abstract void show();
}
