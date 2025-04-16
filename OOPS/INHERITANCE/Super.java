
import calculator.*;

class A extends Object { //auto extends by java

    public A() {
        System.out.println("In A");

    }

    public A(int n) {
        System.out.println("In A int");
    }
}

class B extends A {

    public B() { //default constructor
        //super();
        //super(2); // passed by us
        System.out.println("In B");
    }

    public B(int n) { //parametrized constructor
        //super();
        // super(n); // passed by us
        // this(); //sub class constructor
        System.out.println("In B int");
    }

    public void show() {
        System.out.println("Show");
    }
}

class Super {

    public static void main(String a[]) {
        // B b2 = new B();
        // new B(); // anonymous object
        new B().show(); //can't reuse of object
        // B b;
        // b = new B();
        // B a2 = new B(3);

        Calc cal = new Calc();
        System.err.println(cal.add(3, 5));
    }
}
