package org.codegym.crud_user.service;

import org.codegym.crud_user.model.User;
import org.codegym.crud_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllListUsers(){
       return userRepository.getAllUserList();
    }
    public void addUser(User user){
        userRepository.addUserToList(user);
    }
    public void delete(int id){
        userRepository.removeUserFromList(id);
    }
    public void update(User user){
        userRepository.EditUser(user);
    }
    public User findById(int id){
    return userRepository.finByID(id);
    }
}
