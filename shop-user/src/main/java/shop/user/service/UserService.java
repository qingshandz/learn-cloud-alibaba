package shop.user.service;

import shop.bean.User;

/**
 * @author wh
 * @date 2022/7/11 11:01
 * @description: User接口
 */
public interface UserService {

    /**
     * 根据id获取用户信息
     */
    User getUserById(Long userId);
}
