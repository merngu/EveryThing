package com.rock.Spring;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;

/**
 * FileName: ApplicationContext
 * Date:   20242024/9/4下午7:48
 * Description:
 * <author> maziyu
 */
public class ApplicationContext {
    private Class config;

    public ApplicationContext(Class config) {
        this.config = config;

        // 扫描

        if (config.isAnnotationPresent(ComponenScan.class)){
            ComponenScan componenScan = (ComponenScan) config.getAnnotation(ComponenScan.class);
            // 扫描路径
            String value = componenScan.value();
            System.out.println(value);

            String replace = value.replace(".", "/");

            URL resource = ApplicationContext.class.getClassLoader().getResource(replace);
            System.out.println(resource);

            File file = new File(resource.getFile());

            if (file.isDirectory()){
            }


        }
    }



    public Object getBean(String name){
        return null;
    }
}
