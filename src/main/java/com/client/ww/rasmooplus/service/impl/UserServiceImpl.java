package com.client.ww.rasmooplus.service.impl;

import com.client.ww.rasmooplus.dtos.UserDto;
import com.client.ww.rasmooplus.mapper.UserMapper;
import com.client.ww.rasmooplus.model.User;
import com.client.ww.rasmooplus.model.UserType;
import com.client.ww.rasmooplus.repository.UserRepository;
import com.client.ww.rasmooplus.repository.UserTypeRepository;
import com.client.ww.rasmooplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public User create(UserDto userDto) {

        if(Objects.nonNull(userDto.id())){
            throw new RuntimeException("Id must be null");
        }

        var userTypeOptional = userTypeRepository.findById(userDto.userTypeId());
        if(userTypeOptional.isEmpty()){
            throw new RuntimeException("User type not found");
        }

        UserType userType = userTypeOptional.get();
        var user = UserMapper.FromDtoToEntity(userDto, userType, null);
        return userRepository.save(user);
    }
}
