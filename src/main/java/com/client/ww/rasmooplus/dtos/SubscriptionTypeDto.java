package com.client.ww.rasmooplus.dtos;

import com.client.ww.rasmooplus.model.SubscriptionType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;


import java.math.BigDecimal;

@Builder
public record SubscriptionTypeDto(
        Long id,

        @NotBlank
        String name,

        @NotNull
        @Max(12)
        Long accessMonth,

        @NotBlank
        String productKey,

        @NotNull
        BigDecimal price) {

    public SubscriptionTypeDto(SubscriptionType subscriptionType) {
        this(subscriptionType.getId(), subscriptionType.getName(), subscriptionType.getAccessMonth(), subscriptionType.getProductKey(), subscriptionType.getPrice());
    }

}
