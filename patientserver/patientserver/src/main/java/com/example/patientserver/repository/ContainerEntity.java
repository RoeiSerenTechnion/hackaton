package com.example.patientserver.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ContainerEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String patientId;

    private String containerId;

    public ContainerEntity(String containerId, String patientId) {
        this.containerId = containerId;
        this.patientId = patientId;
    }
}
