package com.rock.Spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName: ComponenScan
 * Date:   20242024/9/4下午7:51
 * Description:
 * <author> maziyu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ComponenScan {
    String value() default "";
}
