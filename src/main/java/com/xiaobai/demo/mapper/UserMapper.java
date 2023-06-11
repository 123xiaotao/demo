package com.xiaobai.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaobai.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {
List<User> fun(String name, Integer age);

List<Map<String,Object>> selectMap();

Map<String,Object> get();


List<User> getUserInfo(@Param("id") int[] id);
List<User> getUserInfo1(@Param("id") List<Integer> id);
List<User> getUserInfo2(@Param("id")HashMap<String,Object> map);

}
