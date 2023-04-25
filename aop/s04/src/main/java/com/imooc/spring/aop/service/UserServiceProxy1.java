package com.imooc.spring.aop.service;



public class UserServiceProxy1 implements UserService{
    private UserService userService;

    public UserServiceProxy1(UserService userService){
        this.userService = userService;

    }

    public void userCreate() {
        userService.userCreate();
        System.out.println("======后置扩展功能=====");
    }
}
