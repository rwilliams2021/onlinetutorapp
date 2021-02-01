package com.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.finalproject.dao.UserDao;
import com.finalproject.domain.User;
import com.finalproject.domain.Login;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
