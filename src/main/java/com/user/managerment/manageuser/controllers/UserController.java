package com.user.managerment.manageuser.controllers;

import com.user.managerment.manageuser.dao.models.User;
import com.user.managerment.manageuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/")
    public @ResponseBody List<User>getUsers(){
       return userService.list();
    }
    @PostMapping(value = "/")
    public @ResponseBody String create(@RequestBody User user)
    {
        return userService.create(user);
    }

    @PutMapping(value = "/")
    public @ResponseBody String update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody String removeUser(@PathVariable(value = "id") long id){
        return userService.delete(id);
    }

}
