package shop.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.product.mapper.ProductMapper;
import shop.product.service.ProductService;
import shop.bean.Product;

/**
 * @author wh
 * @date 2022/7/11 14:26
 * @description: 商品业务实现类
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductById(Long pid) {
        return productMapper.selectById(pid);
    }

    @Override
    public int updateProductStockById(Integer count, Long id) {
        return productMapper.updateProductStockById(count,id);
    }
}
