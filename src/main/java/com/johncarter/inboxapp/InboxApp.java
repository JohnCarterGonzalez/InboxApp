package com.johncarter.inboxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Path;

@SpringBootApplication
@RestController
public class InboxApp {

	public static void main(String[] args) {
		SpringApplication.run(InboxApp.class, args);
	}
	
    /**
    * connnects the Spring Boot application to the Astra secure bundle
    */

    @Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
        Path bundle = astraProperties.getSecureConnectBundle().toPath();
        return builder -> builder.withCloudSecureConnectBundle(bundle);
    }

}
