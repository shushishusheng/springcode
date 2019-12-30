package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2019/12/30 11:34
 **/
public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}

