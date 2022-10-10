package org.xiaomi.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.xiaomi.entity.Users;
//@Component
@Repository("userDao999")
public class UserDao implements  UserDaoIfac{




    @Override
    public Users selectUserById(Integer id) {
        System.out.println("get User,userid:"+id);
        return new Users();
    }
}
