package com.client.ww.rasmooplus.dtos;

import com.client.ww.rasmooplus.model.SubscriptionType;
import lombok.Builder;


import java.math.BigDecimal;

@Builder
public record SubscriptionTypeDto(Long id, String name, Long accessMonth, String productKey, BigDecimal price) {

    public SubscriptionTypeDto(SubscriptionType subscriptionType) {
        this(subscriptionType.getId(), subscriptionType.getName(), subscriptionType.getAccessMonth(), subscriptionType.getProductKey(), subscriptionType.getPrice());
    }

}
