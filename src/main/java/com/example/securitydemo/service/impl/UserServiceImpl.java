package com.example.securitydemo.service.impl;

import com.example.securitydemo.domain.SystemUser;
import com.example.securitydemo.repository.UserRepository;
import com.example.securitydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User with username "+username+" not found!");
        }
        return user;
    }

}
