package shop.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import shop.bean.Product;
import shop.order.feign.fallback.ProductServiceFallBack;
import shop.order.feign.fallback.factory.ProductServiceFallBackFactory;
import shop.order.feign.fallback.factory.UserServiceFallbackFactory;
import shop.utils.resp.Result;

/**
 * @author wh
 * @date 2022/7/15 15:02
 * @description: 调用商品服务接口
 */
//@FeignClient(value = "server-product", fallback = ProductServiceFallBack.class)
@FeignClient(value = "server-product", fallbackFactory = ProductServiceFallBackFactory.class)
public interface ProductService {

    /**
     * 获取商品信息
     */
    @GetMapping(value = "/product/get/{pid}")
    Product getProduct(@PathVariable("pid") Long pid);
    /**
     * 更新库存数量
     */
    @GetMapping(value = "/product/update_count/{pid}/{count}")
    Result<Integer> updateCount(@PathVariable("pid") Long pid, @PathVariable("count") Integer count);
}
