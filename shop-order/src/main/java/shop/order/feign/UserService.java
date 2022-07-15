package shop.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import shop.bean.User;

/**
 * @author wh
 * @date 2022/7/15 15:00
 * @description: 调用用户微服务的接口
 */
@FeignClient("server-user")
public interface UserService {

    @GetMapping(value = "/user/get/{uid}")
    User getUser(@PathVariable("uid") Long uid);
}
