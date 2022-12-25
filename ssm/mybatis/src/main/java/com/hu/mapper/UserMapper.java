package com.hu.mapper;

import com.hu.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    int insertUser(User user);
    List<User> selectUser();

    /**
     * username获取user
     * @param username
     * @return
     */
//    参数为单个字面量 在sql中获取值时可以随便写 ，一般写为参数名,见名知意
    User selectUserByName(String username);

    /**
     * username和password共同获取
     * @param username
     * @param password
     * @return
     */
    //    参数为多个字面量 框架会将参数放在map集合中
    //    在sql中获取值时  以args0，agrs1，agrs2。。。。
    //                    或parm1，parm2，parm3.。。为键，以参数为值
    //          两种可以混着一起用
    User selectUserByNameAndPassword(String username,String password);

    /**
     * 以map的方式传值
     * @param map
     * @return
     */
    //
    // 参数为map时，获取参数时使用自己设置的键
    User selectUserByMap(Map<String,Object> map);
/*
 Map<String,Object> map = new HashMap<>();
    map.put("username","sss");
    map.put("password",123);
    selectUserByMap(map);
 */

}
