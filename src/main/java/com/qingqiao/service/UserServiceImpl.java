package com.qingqiao.service;

import com.qingqiao.mapper.UserMapper;
import com.qingqiao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    public List<User> queryAll(){
        return mapper.queryAll();
    }

    /*@Scheduled(fixedRate = 2000)
    public void fixedRate() {
        System.out.println("fixedRate>>>"+new Date());
    }
    @Scheduled(fixedDelay = 2000)
    public void fixedDelay() {
        System.out.println("fixedDelay>>>"+new Date());
    }
    @Scheduled(initialDelay = 2000,fixedDelay = 2000)
    public void initialDelay() {
        System.out.println("initialDelay>>>"+new Date());
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void cron() {
        System.out.println(new Date());
    }*/

    public void sayHello() {
        System.out.println("hello userservice >>>"+new Date());
    }
}
