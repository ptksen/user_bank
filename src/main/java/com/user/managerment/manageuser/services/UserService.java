package com.user.managerment.manageuser.services;

import com.user.managerment.manageuser.dao.models.User;

import java.util.List;

public interface UserService {

    List<User> list();
    String create(User user);
    String update(User user);
    String delete (long id);

}
