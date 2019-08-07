package com.api.songo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        ApiApplication.class,
        Jsr310Converters.class
})
public class ApiApplication {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
