package aliyar.mostafa.training.finaleqalse;

import java.util.Objects;

public class Person  {
    private String name;
    private int age;
    private int Cod;
    public Person(String name, int age, int Cod) {
        this.name = name;
        this.age = age;
        this.Cod = Cod;
    }
    @Override
        public boolean equals(Object o) {
        Person person = (Person) o;
        return this.Cod == person.Cod&& Objects.equals(this.name, person.name) ||this.age==person.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
