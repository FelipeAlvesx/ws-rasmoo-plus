package com.client.ww.rasmooplus.dtos;


import java.math.BigDecimal;

public record SubscriptionTypeUpdateDto(
        Long id,

        String name,

        Long accessMonth,

        String productKey,

        BigDecimal price

) {
}
