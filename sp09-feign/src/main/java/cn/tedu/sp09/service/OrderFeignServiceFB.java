package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2020/1/2 13:13
 **/
@Component
public class OrderFeignServiceFB implements OrderFeignService {

    @Override
    public JsonResult<Order> getOrder(String orderId) {
        return JsonResult.err("无法获取商品订单");
    }

    @Override
    public JsonResult addOrder() {
        return JsonResult.err("无法保存订单");
    }

}
