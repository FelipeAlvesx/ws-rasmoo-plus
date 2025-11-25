package com.client.ww.rasmooplus.mapper;

import com.client.ww.rasmooplus.dtos.UserDto;
import com.client.ww.rasmooplus.model.SubscriptionType;
import com.client.ww.rasmooplus.model.User;
import com.client.ww.rasmooplus.model.UserType;

import java.time.LocalDate;

public class UserMapper {

    public static User FromDtoToEntity(UserDto userDto, UserType userType, SubscriptionType subscriptionType) {
        return User.builder()
                .name(userDto.name())
                .email(userDto.email())
                .phone(userDto.name())
                .cpf(userDto.cpf())
                .dtSubscription(LocalDate.now())
                .dtExpiration(LocalDate.now())
                .userType(userType)
                .subscriptionType(subscriptionType)
                .build();
    }


}
