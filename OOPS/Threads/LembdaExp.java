
class LembdaExp {

    public static void main(String agr[]) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            }
        };
        //or simple method
        Runnable obj2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
