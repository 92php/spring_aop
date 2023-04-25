package com.imooc.spring.aop.service;

import com.imooc.spring.aop.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void createUser(){
        if(1==1){
            throw new RuntimeException("用户已存在");
        }
        System.out.println("执行创建用户逻辑");
        userDao.insert();
    }

    public String generateRandomPassword(String type,Integer length){
        System.out.println("按" + type + "方式生成" + length + "位随机密码");
        return "Zxcdfg23d";
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
