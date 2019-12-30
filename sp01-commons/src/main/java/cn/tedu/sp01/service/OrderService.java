package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2019/12/30 11:34
 **/
public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}

