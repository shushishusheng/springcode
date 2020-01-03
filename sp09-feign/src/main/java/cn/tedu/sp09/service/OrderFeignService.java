package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2020/1/2 13:08
 **/
@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable String orderId);

    @GetMapping("/")
    JsonResult addOrder();

}
