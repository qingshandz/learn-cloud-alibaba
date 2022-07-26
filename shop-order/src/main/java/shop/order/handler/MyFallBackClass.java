package shop.order.handler;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wh
 * @date 2022/7/26 13:16
 * @description: 定义异常时调用的方法 方法必须static
 */
@Slf4j
public class MyFallBackClass {

    public static String fallback(Throwable e) {
        log.error("异常了:{}", e);
        return "异常了";
    }
}
