package com.cs.blog.service;

import com.cs.blog.po.User;

public interface UserService {
    User userChecked(String username, String password);
}
