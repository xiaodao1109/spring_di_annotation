package org.xiaomi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xiaomi.dao.AccDao;
import org.xiaomi.dao.OrderDaoIfac;

public class TestUserService {

    public static void main(String[] args) {

        ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");

//        UserServiceIfac userService1=(UserServiceIfac) act.getBean("userService");
//        UserServiceIfac userService2=(UserServiceIfac) act.getBean("userService");
//        UserServiceIfac userService3=(UserServiceIfac) act.getBean("userService");
//
//        System.out.println(userService1==userService2);
//        System.out.println(userService2==userService3);

        OrderDaoIfac orderDaoIfac=(OrderDaoIfac) act.getBean(org.xiaomi.dao.OrderDao.class);

        System.out.println(orderDaoIfac.selectAllOrder(1));;

        AccDaoIfac

    }
}
