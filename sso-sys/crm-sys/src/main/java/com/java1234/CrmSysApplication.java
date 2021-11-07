package com.java1234;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
}

 * 开启CAS @EnableCasClient
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableCasClient
public class CrmSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSysApplication.class, args);
    }
}
