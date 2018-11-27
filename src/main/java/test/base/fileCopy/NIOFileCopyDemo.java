package test.base.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIOFileCopyDemo {
    public static void copyFile(File source, File destination) {
        try(FileChannel sourceChannel = new FileInputStream(source).getChannel();
            FileChannel destChannel = new FileOutputStream(destination).getChannel()){
            long transferred;
            for(long count = sourceChannel.size(); count > 0 ;){
                transferred = destChannel.transferFrom(sourceChannel, sourceChannel.position(), count);
                sourceChannel.position(sourceChannel.position() + transferred);
                count -= transferred;
            }
        }catch (IOException e) {

        }
    }
}
