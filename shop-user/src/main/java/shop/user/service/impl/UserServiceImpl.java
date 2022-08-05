package shop.user.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import shop.bean.User;
import shop.user.mapper.UserMapper;
import shop.user.service.UserService;

/**
 * @author wh
 * @date 2022/7/11 11:07
 * @description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }

    @Async
    @Override
    public void asyncMethod() {
        log.info("执行了异步任务...");
    }
}
