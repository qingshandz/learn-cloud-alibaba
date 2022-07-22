package shop.order.feign.fallback;

import org.springframework.stereotype.Component;
import shop.bean.Product;
import shop.order.feign.ProductService;
import shop.utils.resp.Result;

/**
 * @author wh
 * @date 2022/7/22 16:12
 * @description: 产品服务容错类
 */
@Component
public class ProductServiceFallBack implements ProductService {
    @Override
    public Product getProduct(Long pid) {
        Product product = new Product();
        product.setId(-1L);
        return product;
    }

    @Override
    public Result<Integer> updateCount(Long pid, Integer count) {
        Result<Integer> result = new Result<>();
        result.setCode(1001);
        result.setCodeMsg("触发了容错逻辑");
        return result;
    }
}
