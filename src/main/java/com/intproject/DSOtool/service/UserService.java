package com.intproject.DSOtool.service;

import com.intproject.DSOtool.data.Role;
import com.intproject.DSOtool.data.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {

    User createNewUserAccount(User userDto);
    Optional<User> findUserById(Long id);
    void deleteUserById(Long id);
    User findUserByUsername(String username);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    Optional<User> findByEmail(String email);
    Map<Role , List<User>> findAllByRoles(List<Role> roles);

}
