package shop.user.rocketmq;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import shop.bean.Order;

/**
 * @author wh
 * @date 2022/8/12 10:45
 * @description:
 */
@Slf4j
@Component
@RocketMQMessageListener(consumerGroup = "user-group",topic = "order-topic")
public class RocketConsumeListener implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        log.info("用户微服务收到了订单信息：{}", JSONObject.toJSONString(order));
    }
}
