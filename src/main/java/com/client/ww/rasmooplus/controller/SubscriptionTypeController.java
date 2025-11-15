package com.client.ww.rasmooplus.controller;

import com.client.ww.rasmooplus.dtos.SubscriptionTypeDto;
import com.client.ww.rasmooplus.model.SubscriptionType;
import com.client.ww.rasmooplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeService subscriptionTypeService;


    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll(){

        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable Long id){

        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));

    }

    @PostMapping
    public ResponseEntity<SubscriptionTypeDto> create(@RequestBody SubscriptionTypeDto subscriptionTypeDto){
        var subscriptionType = subscriptionTypeService.create(subscriptionTypeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SubscriptionTypeDto(subscriptionType));
    }



    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionType> update(@PathVariable Long id, @RequestBody SubscriptionTypeDto subscriptionTypeDto){

        return ResponseEntity.status(HttpStatus.OK)
                .body(subscriptionTypeService.update(id, subscriptionTypeDto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        subscriptionTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }



}
