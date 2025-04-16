
class Mobile {

    String brand;
    int price; //instance var or obj var
    static String name; //static var is common for all / static name is class's member not object's member

    static { //called only once 
        name = "ab"; //static block is used to initialize the static var
        System.out.println("in static block");
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }
}

class staticMem {

    public static void main(String a[]) throws ClassNotFoundException {
        // Mobile m1 = new Mobile();
        // //obj m1 is create in heap memory with address
        // m1.brand = "Apple";
        // m1.price = 1500;
        // m1.name = "SmartPhone"; //static create once in memory without object and common for all
        // System.err.println(m1.name);
        // Mobile m2 = new Mobile();
        // m2.brand = "Samsung";
        // m2.price = 1700;
        // m2.name = "Phone"; //changes also in m1 and for all 
        // m1.show();
        // m2.show();
        // Mobile.name = "Nothing";
        // System.err.println(m1.name);

        Class.forName("Mobile");

    }
}
