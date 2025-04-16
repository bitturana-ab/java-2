
final class A { //final ->stop inheritance or can't be extended

    public void show() {
        System.out.println("in A show");
    }
}

class B {

    public final void show() { // stop method overriding
        System.out.println("Final method");
    }
}

class C extends B {
    // public void show(){

    // }
}

class FinalKeyword {

    public static void main(String arg[]) {
        A b = new A();
        b.show();
        final int a = 2;
        // a=4; // can't change final value
    }
}
