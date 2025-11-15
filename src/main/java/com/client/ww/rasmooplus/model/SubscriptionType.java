package com.client.ww.rasmooplus.model;

import com.client.ww.rasmooplus.dtos.SubscriptionTypeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {

    @Id
    @Column(name = "subscriptions_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "access_months")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "product_key", unique = true)
    private String productKey;


    public SubscriptionType(SubscriptionTypeDto subscriptionTypeDto){
        this(subscriptionTypeDto.id() ,subscriptionTypeDto.name(),
                subscriptionTypeDto.accessMonth(), subscriptionTypeDto.price(),
                subscriptionTypeDto.productKey());
    }


}
