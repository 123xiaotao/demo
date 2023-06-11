package com.xiaobai.demo.config;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xiaobai.demo.entity.User;
import com.xiaobai.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Testt {
    @Na(value = "xiaobai")
    String name;
    @Autowired
    UserMapper user;
    public void contextLoads55() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId,1);
        List<User> users = user.selectList(wrapper);
        System.out.println(users);
        System.out.println(name);
    }
}
