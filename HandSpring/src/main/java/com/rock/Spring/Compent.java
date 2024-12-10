package com.rock.Spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName: Compent
 * Date:   20242024/9/4下午7:57
 * Description:
 * <author> maziyu
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Compent {
    String value() default "";
}
