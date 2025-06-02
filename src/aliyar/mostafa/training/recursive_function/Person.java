package aliyar.mostafa.training.recursive_function;

public class Person extends Object{
    private String name;
    private int cod;
    private int codeFather;
    public Person(String name, int cod) {
        this.name = name;
        this.cod = cod;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodeFather() {
        return codeFather;
    }
    public void setCodeFather(int codeFather) {
        this.codeFather = codeFather;
    }

    @Override
    public boolean equals(Object o) {
        int code= (int) o;
        return this.cod ==code ;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Cod: " + cod;
    }

}
