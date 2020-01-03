package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 舒丑澳
 * @version 1.0
 * 类描述:
 * @date 2020/1/2 13:11
 **/
@Component
public class ItemFeignServiceFB implements ItemFeignService {

    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("无法获取订单商品列表");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }

}
