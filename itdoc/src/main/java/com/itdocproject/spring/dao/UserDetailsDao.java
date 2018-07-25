package com.itdocproject.spring.dao;

import com.itdocproject.spring.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
