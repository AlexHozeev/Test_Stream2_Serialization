package Stream2;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {

    private String bread;
    private String name;
    private int age;
    private int weight;

    public Dog(String bread, String name, int age, int weight) {
        this.bread = bread;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getBread() {
        return bread;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && weight == dog.weight && Objects.equals(bread, dog.bread) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, name, age, weight);
    }
}
