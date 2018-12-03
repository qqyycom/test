package test.annotation;

import java.lang.annotation.*;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/11/26 14:15
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface MyAnnotation {
    String value() default "Default Value";

    int order() default 0;
}
