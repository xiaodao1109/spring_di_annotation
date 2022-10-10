package org.xiaomi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xiaomi.dao.OrderDao;
import org.xiaomi.dao.OrderDaoIfac;

@Configuration  //这是一个配置类，spring 容器会扫描到的
public class AppConfig {

    //对OrderDao进行配置
    @Bean
    public OrderDaoIfac getOrderDao(){
        return new OrderDao();
    }

}
