package com.client.ww.rasmooplus.dtos.wsraspay;

public record OrderDto(
        String id,
        String customerId,
        Long discount,
        String productAcronym
) {
}
