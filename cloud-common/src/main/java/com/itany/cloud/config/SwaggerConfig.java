package com.itany.cloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //启用Swagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定需要暴露的Swagger2的接口所在的包
                .apis(RequestHandlerSelectors.basePackage("com.itany.cloud"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建API接口文档的基本信息
     * 这些信息会在对应的接口文档中展现
     * @return
     */
    public ApiInfo apiInfo(){
        // 由于ApiInfo的构造函数中需要对所有信息均进行创建
        // 但是实际开发中我们可能只需要部分信息
        // 因此,使用ApiInfoBuilder进行部分信息的构造
        // ApiInfoBuilder中提供了返回ApiInfo的方法
        return new ApiInfoBuilder()
                // 设置标题信息
                .title("Restful API接口文档")
                // 设置描述信息
                .description("使用Swagger2构建的Restful API接口文档")
                // 设置联系人
                .contact(new Contact("admin","https://www.baidu.com/","123456789@qq.com"))
                // 设置版本号
                .version("1.0")
                .build();
    }
}
