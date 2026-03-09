//synchronized

class Counter {

    int count;

    // synchronized means method call once at a time
    public synchronized void increment() {
        count++;
    }
}

class SynchThread {

    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c1.increment();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c1.increment();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join(); // main method will wait for threads (dont go to next line)
        t2.join();
        System.out.println(c1.count);

    }
}
