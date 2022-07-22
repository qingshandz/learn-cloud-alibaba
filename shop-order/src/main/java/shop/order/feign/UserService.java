package shop.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import shop.bean.User;
import shop.order.feign.fallback.UserServiceFallBack;
import shop.order.feign.fallback.factory.UserServiceFallbackFactory;

/**
 * @author wh
 * @date 2022/7/15 15:00
 * @description: 调用用户微服务的接口
 */
//@FeignClient(value = "server-user", fallback = UserServiceFallBack.class)
@FeignClient(value = "server-user", fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {

    @GetMapping(value = "/user/get/{uid}")
    User getUser(@PathVariable("uid") Long uid);
}
