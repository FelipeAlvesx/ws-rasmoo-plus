package com.client.ww.rasmooplus.integration.impl;

import com.client.ww.rasmooplus.dtos.wsraspay.CustomerDto;
import com.client.ww.rasmooplus.dtos.wsraspay.OrderDto;
import com.client.ww.rasmooplus.dtos.wsraspay.PaymentDto;
import com.client.ww.rasmooplus.integration.WsRaspayIntegration;
import org.springframework.stereotype.Component;

@Component
public class WsRaspayIntegrationImpl implements WsRaspayIntegration {

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public boolean processPayment(PaymentDto paymentDto) {
        return false;
    }
}
