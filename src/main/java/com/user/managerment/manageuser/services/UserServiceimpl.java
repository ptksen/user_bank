package com.user.managerment.manageuser.services;

import com.user.managerment.manageuser.dao.models.User;
import com.user.managerment.manageuser.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public String create(User user) {
        userRepository.save(user);
        return "OK";
    }

    @Override
    public String update(User user) {
        userRepository.save(user);
        return "OK";
    }

    @Override
    public String delete(long id) {
        userRepository.deleteById(id);
        return "OK";
    }
}
