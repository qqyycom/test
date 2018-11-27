package test.base.fileCopy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

    }
}

class test
{
    public static int i = 0;

    public static void setI(int val){
        i = val;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        test t1 = new test();
        test t2 = new test();

        t1.setI(10);
        t2.setI(15);
        System.out.println(t1.i);
        System.out.println(t2.i);

    }
}
