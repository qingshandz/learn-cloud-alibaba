package shop.order.feign.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import shop.bean.User;
import shop.order.feign.UserService;

/**
 * @author wh
 * @date 2022/7/22 16:51
 * @description: 用户微服务容错Factory
 */
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUser(Long uid) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
