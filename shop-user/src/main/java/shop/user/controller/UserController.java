package shop.user.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.bean.User;
import shop.user.service.UserService;

/**
 * @author wh
 * @date 2022/7/11 11:16
 * @description: 用户接口
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/get/{uid}")
    public User getProduct(@PathVariable("uid") Long uid){
        User user = userService.getUserById(uid);
        log.info("获取到的用户信息为：{}", JSONObject.toJSONString(user));
        return user;
    }
}
