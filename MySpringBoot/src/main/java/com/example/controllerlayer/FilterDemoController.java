package com.example.controllerlayer;


import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterDemoController {
    private final ApplicationContext applicationContext;

    public FilterDemoController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping(value = "/abc")
    public void show(){
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            if(beanDefinitionName.contains("Filter")){
                System.out.println(beanDefinitionName);
            }
        }
        System.out.println("=====> end <=====");
    }

    @GetMapping(value = "/test/abc")
    public void test(){

    }

}
