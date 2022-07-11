package shop.params;

import lombok.Data;

/**
 * @author wh
 * @date 2022/7/11 17:16
 * @description: 订单入参
 */
@Data
public class OrderParams {

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 购买的商品数量
     */
    private Integer count;

    public boolean isEmpty(){
        return (productId == null || productId <= 0) ||
                (userId == null || productId <= 0) ||
                (count == null || count <= 0);
    }
}
