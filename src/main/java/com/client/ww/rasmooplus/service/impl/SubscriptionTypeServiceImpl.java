package com.client.ww.rasmooplus.service.impl;

import com.client.ww.rasmooplus.dtos.SubscriptionTypeDto;
import com.client.ww.rasmooplus.dtos.SubscriptionTypeUpdateDto;
import com.client.ww.rasmooplus.model.SubscriptionType;
import com.client.ww.rasmooplus.repository.SubscriptionTypeRespository;
import com.client.ww.rasmooplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    private SubscriptionTypeRespository subscriptionTypeRespository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRespository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        return getSubscriptionType(id);
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto)  {

        if(Objects.nonNull(subscriptionTypeDto.id())){
            throw new RuntimeException("Id must be null");
        }

        SubscriptionType subscriptionType = new SubscriptionType(subscriptionTypeDto);
        subscriptionTypeRespository.save(subscriptionType);
        return subscriptionType;
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeUpdateDto subscriptionType) {

        getSubscriptionType(id);

        return subscriptionTypeRespository.save(SubscriptionType.builder()
                .id(id)
                .name(subscriptionType.name())
                .accessMonth(subscriptionType.accessMonth())
                .price(subscriptionType.price())
                .productKey(subscriptionType.productKey())

                .build());

    }

    @Override
    public void delete(Long id) {
        getSubscriptionType(id);

        subscriptionTypeRespository.deleteById(id);

    }


    private SubscriptionType getSubscriptionType(Long id){

        return subscriptionTypeRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("SubscriptionType not found"));

    }



}
