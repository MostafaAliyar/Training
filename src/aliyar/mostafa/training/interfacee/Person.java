package aliyar.mostafa.training.interfacee;

public class Person extends NamedObject implements CanTack,Nameable {
    private String name;
    @Override
    public void tack() {

    }

    @Override
    public void think() {

    }

    @Override
    public String getName() {
        return Person.this.name;
    }

    @Override
    public void setName(String name) {
        Person.this.name = name;
    }
}
