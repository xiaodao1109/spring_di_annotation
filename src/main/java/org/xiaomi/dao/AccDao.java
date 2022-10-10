package org.xiaomi.dao;


import org.springframework.stereotype.Repository;


public class AccDao implements AccDaoIfac {
    @Override
    public String selectAllAccById(Integer userid) {
        return "查询该用户："+userid+" 的所有订单信息";
    }

}
