import java.util.ArrayList;
import java.util.*;

public class Parent extends Person {

    Parent spouse;
    Child[] children = new Child[0];

    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
    }

    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Parent getSpouse() {
        return this.spouse;
    }

    public Child[] getChildren() {
        return this.children;
    }

    public void addChild(Child child) {
        ArrayList<Child> newChildren = new ArrayList<Child>(Arrays.asList(this.children));
        newChildren.add(child);
        this.children = newChildren.toArray(new Child[0]);
    }

}