package com.hu.mapper;

import com.hu.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface UserMapper {
//参数为实体类，以类中属性名获取值

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
    //    在sql中获取值时  以arg0，agr1，agr2。。。。
    //                    或parm1，parm2，parm3.。。为键，以参数为值
    //          两种可以混着一起用
    //
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

    /**
     * 添加Param注解,参数的 键 变为value的值
     *还可以使用param1，param2为参数
     * @param username
     * @param password
     * @return
     */
    User selectUserByParam(@Param(value = "username") String username,@Param("password") String password);

    /**
     * 查询user条数
     * @return
     */
    Integer selectUserCount();


    /**
     * 根据id查user，返回一个Map
      * @param id
     * @return
     */
//    如果查询的结果没有实体类就可以使用map作为返回值类型来接收
    Map<String,Object> selectUserByIdToMap(@Param("id") int id);


//如果不用list装map 则需要指定map的key 使用MapKey注解 将查询结果中的某个字段作为外层map的key
    @MapKey("id")
    Map<String,Object> selectAllUserToMap();//  ==  List<Map<String,Object>> selectAllUserToMap();

}
