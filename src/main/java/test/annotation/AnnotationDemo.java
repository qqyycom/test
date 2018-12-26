package test.annotation;

import java.lang.reflect.Field;

/**
 * 描述：Anotation消费器实例
 *
 * @Auther: qgm
 * @Date: 2018/11/26 14:19
 */
public class AnnotationDemo {
    @MyAnnotation("sssss")
    public String string;

    public static void main(String[] args) {
        AnnotationDemo ad = new AnnotationDemo();
        Class clazz = ad.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            MyAnnotation annotation = f.getAnnotation(MyAnnotation.class);
            try {
                f.set(ad, annotation.value());
                //f.set(clazz, annotation.order());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ad.string);
    }


}


