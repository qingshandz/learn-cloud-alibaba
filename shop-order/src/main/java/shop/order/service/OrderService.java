package shop.order.service;

import shop.params.OrderParams;

/**
 * @author wh
 * @date 2022/7/11 17:15
 * @description:
 */
public interface OrderService {

    /**
     * 保存订单
     */
    void saveOrder(OrderParams orderParams);
}
