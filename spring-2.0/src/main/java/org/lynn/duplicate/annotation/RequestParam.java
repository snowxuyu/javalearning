package org.lynn.duplicate.annotation;

import java.lang.annotation.*;

/**

 * Class Name : org.lynn.annotation
 * Description :
 * @author : cailinfeng
 * Date : 2018/6/26 16:07
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {

    String value() default  "";

}
