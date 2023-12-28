package org.emsi.Eurikaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurikaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaserverApplication.class, args);
	}

}
