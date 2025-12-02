package com.client.ww.rasmooplus.dtos.wsraspay;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomerDto(
        String id,
        String cpf,
        String firstName,
        String lastName,
        String email
) {
}
