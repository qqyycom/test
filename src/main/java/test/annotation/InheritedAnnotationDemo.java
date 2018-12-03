package test.annotation;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/11/26 15:56
 */
public class InheritedAnnotationDemo {

    public static void main(String[] args) {
        Class clazz = new Sub().getClass();
        // 如果InheritedAnnotation中有@Inherited则为true
        // 如果无@Inherited，则为false
        System.out.println(clazz.isAnnotationPresent(InheritedAnnotation.class));
    }
}

@InheritedAnnotation
class Super {

}

class Sub extends Super {

}