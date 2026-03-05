package Encapsulation;

class Human {
    private int age;
    private String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getBio() {
        System.out.println("Name: " + name + " , age: " + age);
    }

    // set and get data
    Human() {
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Enc {
    public static void main(String[] args) {
        Human h1 = new Human(21, "AN ");
        // h1.name = "ab"; // private can be accessed in same class only
        // then ask to the class to reveal the data
        h1.getBio();
        Human h2 = new Human(12, "AB");
        h2.getBio();

        // set or get data
        Human h = new Human();
        h.setAge(28);
        h.setName("Ancy");
        System.out.println(h.getName() + " : " + h.getAge());
    }
}
