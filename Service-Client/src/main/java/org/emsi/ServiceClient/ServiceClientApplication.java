package org.emsi.ServiceClient;

import org.emsi.ServiceClient.model.Client;
import org.emsi.ServiceClient.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "nidazi", "mehdi", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"), "lozir", "salma", Float.parseFloat("22")));

		};
	}
}
