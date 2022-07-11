package shop.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import shop.bean.Product;

/**
 * @author wh
 * @date 2022/7/11 14:20
 * @description:
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 扣减商品库存
     */
    int updateProductStockById(@Param("count") Integer count, @Param("id") Long id);
}
