package com.example.patientserver;

import com.example.patientserver.repository.ContainerEntity;
import com.example.patientserver.repository.PatienetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class InitComponent {
    private PatienetRepository patienetRepository;

    @PostConstruct
    private void insertValues() {
        patienetRepository.save(new ContainerEntity("mycontainer", "AviThePatient"));
    }

}
