package com.qingqiao.service;

import com.qingqiao.model.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();
    public void sayHello();
}
