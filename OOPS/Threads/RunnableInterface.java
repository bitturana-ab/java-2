class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class RunnableInterface {
    public static void main(String agr[]) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}