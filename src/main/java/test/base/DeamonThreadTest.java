package test.base;

import java.lang.reflect.Field;

public class DeamonThreadTest {

    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new DeamonThread());
//        t1.setDaemon(true);

        Class c = Class.forName("java.lang.Thread");
        Field f = c.getDeclaredField("threadStatus");
        f.setAccessible(true);
        int status = (int)f.get(t1);
        System.out.println(status);
        t1.start();
        Thread.sleep(500);
        status = (int)f.get(t1);
        Thread.State state = t1.getState();
        System.out.println(status + state.toString());


    }
}

class DeamonThread implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("this is a deamon thread");
        }catch (InterruptedException e){
           e.printStackTrace();
        }
    }
}
