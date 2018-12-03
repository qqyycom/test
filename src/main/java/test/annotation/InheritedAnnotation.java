package test.annotation;

import java.lang.annotation.*;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/11/26 15:51
 */
//@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InheritedAnnotation {
    String name() default "Sub annotation";
}

