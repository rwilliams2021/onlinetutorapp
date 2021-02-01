package com.finalproject.dao;

import com.finalproject.domain.Login;
import com.finalproject.domain.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
