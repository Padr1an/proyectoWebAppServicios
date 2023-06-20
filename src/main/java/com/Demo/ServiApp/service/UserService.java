package com.Demo.ServiApp.service;

import com.Demo.ServiApp.entity.User;


public interface UserService {
    
    User createUser(String name, String lastName, String role, Long idNumber, String email, String password,
            String phone, String address, String neighboorhood, String city, String image);
    
    User updateUser(Long id, String email, String password, String phone, String address, 
            String neighboorhood, String city, String image);
    
    User getUser(Long id);
    
    void activateUser(Long id);
    
    void deactivateUser(Long id);
    
}
