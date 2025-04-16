
abstract class ovr {

    public ovr() {
        overrideMethod();
    }

    public abstract void overrideMethod();
    //override with creating object

}
class N extends ovr{
    public void overrideMethod(){
        
    }
}

class Mobile {

    String brand;
    int price;

    static String name;

    static { //run only once cause class loader load once 
        name = "phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
}

class constrStatic {

    public static void main(String a[]) throws ClassNotFoundException {
        // Mobile m1 = new Mobile();
        // Mobile m2 = new Mobile();
        // System.out.println(m1.name);
        // m2.name = "smart";
        // System.out.println(m1.name);
        Class.forName("Mobile");//not create object //this will not call constructor //only load a class

        ovr obj = new ovr() {
            public void overrideMethod() {
                System.out.println("Method overrided");
            }
        };
    }
}
