
class A extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("Hi ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("AB ");
        }
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TwoThread {

    public static void main(String arg[]) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
