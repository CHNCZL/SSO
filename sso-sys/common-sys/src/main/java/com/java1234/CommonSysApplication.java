package com.java1234;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
}

 * 开启CAS @EnableCasClient
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CommonSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonSysApplication.class, args);
    }
}
