package com.client.ww.rasmooplus.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record UserDto(

        Long id,

        @NotBlank(message = "Name cannot be blank")
        String name,

        @Email
        String email,

        @Size(min = 6)
        String phone,

        @CPF
        String cpf ,

        LocalDate dtSubscription,
        LocalDate dtExpiration,

        @NotNull
        Long userTypeId,

        Long subscriptionTypeId) {
}
