package com.finalproject.service;

import com.finalproject.domain.Login;
import com.finalproject.domain.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
