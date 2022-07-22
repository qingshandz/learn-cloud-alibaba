package shop.order.feign.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import shop.bean.Product;
import shop.order.feign.ProductService;
import shop.utils.resp.Result;

/**
 * @author wh
 * @date 2022/7/22 16:53
 * @description: 商品微服务容错Factory
 */
@Component
public class ProductServiceFallBackFactory implements FallbackFactory<ProductService> {
    @Override
    public ProductService create(Throwable throwable) {
        return new ProductService() {
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
        };
    }
}
