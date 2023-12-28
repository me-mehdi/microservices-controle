package org.emsi.voitureservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.emsi.voitureservice.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
