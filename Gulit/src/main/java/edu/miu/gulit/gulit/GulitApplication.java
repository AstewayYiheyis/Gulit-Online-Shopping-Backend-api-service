package edu.miu.gulit.gulit;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GulitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulitApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
        return new OpenAPI().info(new Info().title("Gulit application API")
                .version(appVersion)
                .description(appDesciption)
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0")
                .url("http://springdoc.org")));
    }

    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }

}

