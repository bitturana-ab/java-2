
class A {

    public void show1() {
        System.out.println("In A show1");
    }
}

class B extends A {

    public void show2() {
        System.out.println("In B show2");
    }
}

class TypeCasting {

    public static void main(String[] args) {
        // A obj = new B(); //UpCasting
        A obj = (A) new B();
        obj.show1();

        B obj1 = (B) obj; //DownCasting
        obj1.show2();
    }
}
