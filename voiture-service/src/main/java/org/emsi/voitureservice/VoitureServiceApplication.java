package org.emsi.voitureservice;

import org.emsi.voitureservice.client.ClientRestService;
import org.emsi.voitureservice.entities.Voiture;
import org.emsi.voitureservice.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableFeignClients
public class VoitureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureServiceApplication.class, args);
    }

    



    @Bean
    CommandLineRunner commandLineRunner (VoitureRepository voitureRepository, ClientRestService clientRestService){

        return args -> {
           voitureRepository.save(Voiture.builder()
                           .marque("Mercedes")
                            .modele("Class A")
                            .matricule("123456")
                            .clientId(1L)
                            .client(clientRestService.findById(1L))
                            .build());


            voitureRepository.save(Voiture.builder()
                    .marque("BMW")
                    .modele("Class B")
                    .matricule("123456")
                    .clientId(2L)
                    .client(clientRestService.findById(2L))
                    .build());
        };
        
    }}

