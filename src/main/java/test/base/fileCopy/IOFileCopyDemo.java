package test.base.fileCopy;

import java.io.*;

public class IOFileCopyDemo {

    public static boolean copyFile(File source, File destination){
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] bytes = new byte[1024];
            while((fis.read(bytes) > 0)){
                fos.write(bytes);
            }
            fos.write("\nThis is a copy file".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
