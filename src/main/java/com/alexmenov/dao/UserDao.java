package com.alexmenov.dao;

import com.alexmenov.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public User getUser(int id);

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);
}
