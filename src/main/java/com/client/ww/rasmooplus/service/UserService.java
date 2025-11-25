package com.client.ww.rasmooplus.service;

import com.client.ww.rasmooplus.dtos.UserDto;
import com.client.ww.rasmooplus.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User create(UserDto userDto);

}
