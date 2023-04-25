package com.imooc.spring.aop.service;

public class UserServiceImpl implements UserService{

    public void userCreate() {
        System.out.println("执行创建用户业务逻辑");
    }
}
