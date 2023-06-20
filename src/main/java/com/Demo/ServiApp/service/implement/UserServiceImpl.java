package com.Demo.ServiApp.service.implement;

import com.Demo.ServiApp.entity.User;
import com.Demo.ServiApp.repository.UserRepository;
import com.Demo.ServiApp.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(String name, String lastName, String role, Long idNumber, String email, String password,
            String phone, String address, String neighboorhood, String city, String image) {
        
        User user = new User(name, lastName, role, idNumber, email, password, phone, address, neighboorhood, city, image);
        
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, String email, String password, String phone, String address, 
            String neighboorhood, String city, String image) {
        
        Optional<User> response = userRepository.findById(id);
        
        if (response.isPresent()) {
            
            User user = response.get();
            
            user.updateUserData(email, password, phone, address, neighboorhood, city, image);
            
            return userRepository.save(user);
        }
        
        return null;
    }

    @Override
    public User getUser(Long id) {
        
        Optional<User> response = userRepository.findById(id);
        
        if (response.isPresent()) {
            
            User user = response.get();
            
            return user;
        }
        
        return null;
    }
    
    @Override
    public void activateUser(Long id) {
        
        Optional<User> response = userRepository.findById(id);
        
        if (response.isPresent()) {
            
            User user = response.get();
            
            user.activateUser();
        }
        
    }

    @Override
    public void deactivateUser(Long id) {
        
        Optional<User> response = userRepository.findById(id);
        
        if (response.isPresent()) {
            
            User user = response.get();
            
            user.deactivateUser();
        }
        
    }
    
}
