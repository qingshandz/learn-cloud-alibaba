package shop.order.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wh
 * @date 2022/7/26 13:15
 * @description:  定义被Sentinel限流时调用的方法 方法必须static
 */
@Slf4j
public class MyBlockHandlerClass {
    public static String blockHandler(BlockException e) {
        log.error("限流了:{}", e);
        return "限流了";
    }
}
