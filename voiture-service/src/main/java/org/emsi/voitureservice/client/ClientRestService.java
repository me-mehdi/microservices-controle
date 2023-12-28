package org.emsi.voitureservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.emsi.voitureservice.entities.Client;

@FeignClient(name = "SERVICE-CLIENT")
@EnableFeignClients
public interface ClientRestService {

    @GetMapping("/clients/{id}")
    Client findById(@PathVariable Long id);

    @GetMapping("/clients")
    List<Client> findAll();
}
