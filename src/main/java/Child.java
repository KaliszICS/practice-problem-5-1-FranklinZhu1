import java.util.ArrayList;
import java.util.*;

public class Child extends Person {

    Parent parent1, parent2;
    Child[] siblings = new Child[0];

    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Child[] getSiblings() {
        return this.siblings;
    }
    
    public Parent getParent1() {
        return this.parent1;
    }

    public Parent getParent2() {
        return this.parent2;
    }

    public void addSibling(Child child) {
        ArrayList<Child> newSiblings = new ArrayList<Child>(Arrays.asList(this.siblings));
        newSiblings.add(child);
        this.siblings = newSiblings.toArray(new Child[0]);
    }

}