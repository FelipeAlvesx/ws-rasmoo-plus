package com.client.ww.rasmooplus.dtos.wsraspay;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreditCardDto(

        Long cvv,
        String documentNumber,
        Long installments,
        String number,
        Long month,
        Long year
) {
}
