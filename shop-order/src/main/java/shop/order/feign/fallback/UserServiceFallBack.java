package shop.order.feign.fallback;

import org.springframework.stereotype.Component;
import shop.bean.User;
import shop.order.feign.UserService;

/**
 * @author wh
 * @date 2022/7/22 15:59
 * @description: 用户服务容错类
 */
@Component
public class UserServiceFallBack implements UserService {
    @Override
    public User getUser(Long uid) {
        User user = new User();
        user.setId(-1L);
        return user;
    }
}