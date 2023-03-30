package com.example.patientserver;

import com.example.patientserver.repository.PatienetRepository;
import org.springframework.stereotype.Component;

@Component
public class PatientServerService {
    private PatienetRepository patienetRepository;

    public PatientServerService(PatienetRepository patienetRepository) {
        this.patienetRepository = patienetRepository;
    }

    public void save() {
//        patienetRepository.save();
    }
}
