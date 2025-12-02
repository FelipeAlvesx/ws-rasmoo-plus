package com.client.ww.rasmooplus.dtos.wsraspay;

public record PaymentDto(
        CreditCardDto creditCard,
        String customerId,
        String orderId
) {
}
