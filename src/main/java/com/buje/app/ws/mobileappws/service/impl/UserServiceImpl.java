package com.buje.app.ws.mobileappws.service.impl;

import com.buje.app.ws.mobileappws.UserRepository;
import com.buje.app.ws.mobileappws.io.entity.UserEntity;
import com.buje.app.ws.mobileappws.service.UserService;
import com.buje.app.ws.mobileappws.shared.Utils;
import com.buje.app.ws.mobileappws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    Utils utils;

    Utils utils = new Utils();

    @Override
    public UserDto createUser(UserDto user) {

        // if we remove the unique = true in UserEntity
        if(userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("Record already exists.");

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        String publicUserId = utils.generateUserId(30);

        userEntity.setEncryptedPassword("test");
        userEntity.setUserId(publicUserId);

        UserEntity storedUserDetails = userRepository.save(userEntity);
        UserDto returnValue = new UserDto();

        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
    }
}
