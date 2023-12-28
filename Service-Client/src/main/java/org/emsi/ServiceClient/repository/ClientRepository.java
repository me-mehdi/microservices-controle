package org.emsi.ServiceClient.repository;

import org.emsi.ServiceClient.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long>  {

}
