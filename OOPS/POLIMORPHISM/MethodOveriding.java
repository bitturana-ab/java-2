
class A {

    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {

    public void show() {
        System.out.println("in B show");
    }
}

class C extends B {

    public void show() {
        System.out.println("in C show");
    }
}

class MethodOveriding {

    public static void main(String a[]) {
        // B b = new B();
        // b.show();
        // b.config();

//Run time polimorphism ->> Dynamic method dispached
        A obj = new A();
        obj.show(); //in A show

        obj = new B();  //referce is A but object is B =>cause a is parent of b
        obj.show(); //in B show

        obj = new C();
        obj.show(); //in C show

    }
}
