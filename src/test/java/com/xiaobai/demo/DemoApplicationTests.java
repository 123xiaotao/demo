package com.xiaobai.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaobai.demo.config.Testt;
import com.xiaobai.demo.entity.User;
import com.xiaobai.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserMapper user;
    @Autowired
    Testt testt;
    @Test
    void contextLoads5() {
        List list = new ArrayList();
        list.add(1L);
        list.add(2L);
        List list1 = user.selectBatchIds(list);
        System.out.println(list1);
    }
    @Test
    void contextLoads75() {
        testt.contextLoads55();
    }

    @Test
    void contextLoads() {
        List<User> users = user.selectList(null);
        System.out.println(users);
    }
    @Test
    void contextLoads55() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId,1);
        List<User> users = user.selectList(wrapper);
        System.out.println(users);
    }

    @Test

    public  void contextLoads8() {
        User user1 = new User();
        user1.setId(1L);
        user.deleteById(user1);

    }
    @Test
    void contextLoads1() {
        User user1 = new User();
        user1.setAge(26);

        user1.setName("xiaoxiaoxiao");
        user.insert(user1);
    }
    @Test
    void contextLoads2() {
        User user1 = user.selectById(1661355822271197185L);
        user1.setAge(23);
        user.updateById(user1);
    }
    @Test
    void contextLoads21() {
        Page<User> userPage = new Page<>(2,3);
        Page<User> userPage1 = user.selectPage(userPage, null);
        System.out.println(userPage1.getRecords());
    }
    @Test
    void contextLoads3() {
        Map<String, Object> a = user.get();
        System.out.println(a);
    }
    @Test
    void contextLoads34() {
        List<Map<String, Object>> maps = user.selectMap();
        System.out.println(maps);
    }


    @Test
    void contextLoads342() {
        int id[]={1,2,3,4};
        System.out.println(user.getUserInfo(id));
    }
    @Test
    void contextLoads3412() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(user.getUserInfo1(integers));
    }
    @Test
    void contextLoads34212() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("1",2);
        System.out.println(user.getUserInfo2(map));

    }
}
