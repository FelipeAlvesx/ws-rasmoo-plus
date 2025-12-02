package com.client.ww.rasmooplus.integration;

import com.client.ww.rasmooplus.dtos.wsraspay.CustomerDto;
import com.client.ww.rasmooplus.dtos.wsraspay.OrderDto;
import com.client.ww.rasmooplus.dtos.wsraspay.PaymentDto;

public interface WsRaspayIntegration {

    CustomerDto createCustomer(CustomerDto customerDto);

    OrderDto createOrder(OrderDto orderDto);

    boolean processPayment(PaymentDto paymentDto);

}
