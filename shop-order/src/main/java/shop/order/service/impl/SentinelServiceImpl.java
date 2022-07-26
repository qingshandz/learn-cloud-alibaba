package shop.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shop.order.handler.MyBlockHandlerClass;
import shop.order.handler.MyFallBackClass;
import shop.order.service.SentinelService;

/**
 * @author wh
 * @date 2022/7/25 16:02
 * @description:
 */
@Slf4j
@Service
public class SentinelServiceImpl implements SentinelService {
    @Override
    @SentinelResource("sendMessage")
    public void sendMessage() {
        System.out.println("测试Sentinel的链路流控模式");
    }

    private int count = 0;

    /**
     *  SentinelResource 规则必须定义在sendMessage2上面才会用到自定义blockHandler
     * @return
     */
    @Override
    @SentinelResource(
            value = "sendMessage2",
            blockHandlerClass = MyBlockHandlerClass.class,
            blockHandler = "blockHandler",
            fallbackClass = MyFallBackClass.class,
            fallback = "fallback"
           )
    public String sendMessage2() {
        count++;
//25%的异常率
        if (count % 4 == 0) {
            throw new RuntimeException("25%的异常率");
        }
        return "sendMessage2";
    }
}
