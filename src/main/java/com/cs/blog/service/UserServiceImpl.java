package com.cs.blog.service;

import com.cs.blog.dao.UserRepository;
import com.cs.blog.po.User;
import com.cs.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User userChecked(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Util.code(password));
        return user;
    }
}
