package org.xiaomi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xiaomi.dao.UserDaoIfac;
import org.xiaomi.entity.Users;

import javax.annotation.Resource;

//@Component
@Service("userService")
@Scope("prototype")
public class UserService implements UserServiceIfac{
/*
    @Autowired  // 根据bean的类型自动装配值：把容器中类型与该类型相同的bean的实例  赋值给userDao属性
    @Qualifier("userDao999")  //和@Autowired配合使用，用来限定bean的名称
    private UserDaoIfac userDao;

 */
   /* @Resource  //默认根据名字来找bean，注值给当前属性；找不到再根据类型找
    private UserDaoIfac userDao;*/

    @Autowired  // 根据bean的类型自动装配值：把容器中类型与该类型相同的bean的实例  赋值给userDao属性
    @Qualifier("userDao999")  //和@Autowired配合使用，用来限定bean的名称
    private UserDaoIfac userDao;

    @Override
    public Users login(Integer id) {
        return userDao.selectUserById(id);
    }

    public void setUserDao(UserDaoIfac userDao) {
        this.userDao = userDao;
    }
}
