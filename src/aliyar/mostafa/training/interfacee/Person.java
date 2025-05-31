package aliyar.mostafa.training.interfacee;

public class Person extends NamedObject implements CanTack,Nameable {
    @Override
    public void tack() {

    }

    @Override
    public void think() {

    }

    @Override
    public String getName() {
        return Person.this.getName();
    }

    @Override
    public void setName(String name) {
        Person.this.name = name;
    }
}
