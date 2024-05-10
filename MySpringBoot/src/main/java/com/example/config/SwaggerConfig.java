package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * FileName: SwaggerConfig
 * Author: bai
 * Date:   20242024/4/1下午5:05
 * Description:Swagger开启配置
 * <author> maziyu
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    //配置 Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("Hedon","http://hedon.wang","171725713@qq.com");

        return new ApiInfo("Swagger API 文档",                    //文档标题
                "这个是一个 Swagger 接口文档。",              //文档描述
                "v1.0",                                       //文档版本
                "http://heon.wang",                   //队伍的网站地址
                contact,                                              //作者信息
                "Apache 2.0",                                  //许可证
                "http://www.apache.org/licenses/LICENSE-2.0",//许可证Url
                new ArrayList());
    }


}
