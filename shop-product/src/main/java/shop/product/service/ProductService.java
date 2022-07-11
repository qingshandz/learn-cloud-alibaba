package shop.product.service;

import shop.bean.Product;

/**
 * @author wh
 * @date 2022/7/11 14:25
 * @description: 商品接口
 */
public interface ProductService {

    /**
     * 根据商品id获取商品信息
     */
    Product getProductById(Long pid);


    /**
     * 扣减商品库存
     */
    int updateProductStockById(Integer count, Long id);
}
