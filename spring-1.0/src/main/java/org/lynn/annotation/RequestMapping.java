package org.lynn.annotation;

import java.lang.annotation.*;

/**

 * Class Name : org.lynn.annotation
 * Description :
 * Author : cailinfeng
 * Date : 2018/6/26 16:07
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {

    String value() default  "";

}
