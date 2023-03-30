package com.example.patientserver;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PairRequestBody {
    @NotNull
    private String patientId;

    @NotNull
    private String containerId;
}
