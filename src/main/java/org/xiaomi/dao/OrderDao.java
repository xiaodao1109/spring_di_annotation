package org.xiaomi.dao;

import org.springframework.stereotype.Repository;


public class OrderDao implements OrderDaoIfac{

    @Override
    public String selectAllOrder(Integer userid) {
        return "查询该用户："+userid+" 的所有订单信息";
    }
}
