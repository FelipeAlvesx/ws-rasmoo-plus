package com.client.ww.rasmooplus.service;

import com.client.ww.rasmooplus.dtos.SubscriptionTypeDto;
import com.client.ww.rasmooplus.dtos.SubscriptionTypeUpdateDto;
import com.client.ww.rasmooplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto);

    SubscriptionType update(Long id, SubscriptionTypeUpdateDto subscriptionTypeDto);

    void delete(Long id);

}
