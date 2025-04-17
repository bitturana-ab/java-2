
// class display {
//     display() { // default constructor
//         System.out.println("Hello World");
//     }
// }
// class constructor1 {
//     public static void main(String[] args) {
//         display d = new display();
//     }
// }
// type of constructor = 
// 1.default constructor = in any oop programming language there is one default constructor which is automatically craeted and invoke whenever object of the class is created. 
// such constructor do not any parameter as an argument.
// class display {
//     display() { // default constructor
//         System.out.println("Hello World");
//     }
// }
// class constructor1 {
//     public static void main(String[] args) {
//         display d = new display();
//     }
// }
// 2. parameterized constructor = those constructor which accept parameter as an argument are called parameterized constructor.
// class display {
//     int x, y, z;
//     display(int a, int b) { 
//         x = a;
//         y = b;
//         System.out.println("Numbers are:" + x + "," + y);
//     }
//     void process() {
//         z = x + y;
//     }
//     void show() {
//         System.out.println("sum: " + z);
//     }
// }
// class constructor1 {
//     public static void main(String[] args) {
//         display d = new display(3, 5);
//         d.process();
//         d.show();
//     }
// }
// area of triangle s = (a+b+c)/2
// area =
// class area {
//     double x, y, z, s, ar;
//     area(double a, double b, double c) { // default constructor
//         x = a;
//         y = b;
//         z = c;
//     }
//     void process() {
//         s = (x + y + z) / 2;
//         ar = Math.sqrt(s * (s - x) * (s - y) * (s - z));
//     }
//     void show() {
//         System.out.println("Area is: " + ar);
//     }
// }
// class constructor1 {
//     public static void main(String[] args) {
//         area d = new area(4, 6, 8);
//         d.process();
//         d.show();
//     }
// }
// 3. multiple constructor = in multiple constructor there are more than constructors present in a class.such constructor performs different, different task, different task are perform a/c to different number of parameter with different data type present in the constructor argument ,no two constructor sood have same number of parameter with same dataType.
class volume {

    double x, y, z;

    volume(double a) {
        x = a;
        double vl = x * x * x;
        System.out.println("Volume is: " + vl);
    }

    volume(double l, double b, double h) {
        x = l;
        y = b;
        z = h;
        double cuboid = x * y * z;
        System.out.println("cubiod is: " + cuboid);
    }

    volume(double r, double h) {
        x = r;
        y = h;
        double cyl = 3.14 * x * x * y;
        System.out.println("Cylinder is: " + cyl);
    }

}

class constructor1 {

    public static void main(String[] args) {
        new volume(23);
        new volume(4, 6, 7);
        new volume(2, 4);
        
    }
}
