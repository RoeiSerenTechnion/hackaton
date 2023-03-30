package com.example.patientserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PatienetRepository extends JpaRepository<ContainerEntity, Long> {
    ContainerEntity findFirstByContainerId(String containerId);
}