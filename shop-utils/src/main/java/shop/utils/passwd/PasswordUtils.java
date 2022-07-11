package shop.utils.passwd;

import shop.utils.md5.MD5Hash;

/**
 * @author wh
 * @date 2022/7/11 14:06
 * @description: 密码工具类
 */
public class PasswordUtils {

    public static String getPassword(String password){
        if (password == null || password.trim().isEmpty()) return password;
        for (int i = 0; i < 5; i++){
            password = MD5Hash.md5Java(password);
        }
        return password;
    }

    public static void main(String[] args){
        System.out.println(getPassword("123456"));
    }
}
