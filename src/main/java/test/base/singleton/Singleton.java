package test.base.singleton;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingletonInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;

    }

    public void func(int x, int y) {
        int r = x + y;
        System.out.println(r);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new RunnableDemo(i));
            t.start();
        }
    }
}

class RunnableDemo implements Runnable {

    private int i;

    public RunnableDemo(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        Singleton s = Singleton.getSingletonInstance();
        s.func(i, i);
    }
}
