package com.example.workindia.dinningreservation.service.impl;

import com.example.workindia.dinningreservation.dto.UserDTO;
import com.example.workindia.dinningreservation.entities.User;
import com.example.workindia.dinningreservation.exception.AlreadyExistsException;
import com.example.workindia.dinningreservation.repository.UserRepository;
import com.example.workindia.dinningreservation.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User  user = modelMapper.map(userDTO, User.class);
        User dbUser  =  userRepository.findByUsername(user.getUsername());

        if(dbUser != null){
            throw  new AlreadyExistsException("User already exists: "+userDTO.getUsername(),userDTO.getUsername());
        }


         userRepository.save(user);

        return modelMapper.map(user,UserDTO.class);

         }

    }

