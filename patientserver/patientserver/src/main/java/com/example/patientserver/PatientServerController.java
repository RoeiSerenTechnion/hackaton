package com.example.patientserver;

import com.example.patientserver.repository.ContainerEntity;
import com.example.patientserver.repository.PatienetRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Component
@AllArgsConstructor
@Slf4j
public class PatientServerController {

    @Autowired
    private final PatienetRepository patienetRepository;

    @GetMapping("/pair")
    public String pairCouple(@RequestParam String containerId, @RequestParam String patientId) {
        log.info("NEW REQUEST FROM: " + containerId + ", " + patientId);
        ContainerEntity containerEntity = patienetRepository.findFirstByContainerId(
                containerId
        );

        if (containerEntity == null) {
            return "try again";
        }

        if (containerEntity.getPatientId().equals(patientId)) {
            return "open";
        }

        return "close";
    }
}
