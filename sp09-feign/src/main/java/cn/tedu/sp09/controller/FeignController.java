package cn.tedu.sp09.controller;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.util.JsonResult;
import cn.tedu.sp09.service.ItemFeignService;
import cn.tedu.sp09.service.OrderFeignService;
import cn.tedu.sp09.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2020/1/2 13:07
 **/
@RestController
public class FeignController {
    @Autowired
    private ItemFeignService itemService;
    @Autowired
    private UserFeignService userService;
    @Autowired
    private OrderFeignService orderService;

    @GetMapping("/item-service/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        return itemService.getItems(orderId);
    }

    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        return itemService.decreaseNumber(items);
    }

    /////////////////////////////////////////

    @GetMapping("/user-service/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/user-service/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score) {
        return userService.addScore(userId, score);
    }

    /////////////////////////////////////////

    @GetMapping("/order-service/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }

    @GetMapping("/order-service")
    public JsonResult addOrder() {
        return orderService.addOrder();
    }
}
