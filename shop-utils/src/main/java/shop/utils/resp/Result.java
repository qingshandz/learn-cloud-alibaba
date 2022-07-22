package shop.utils.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wh
 * @date 2022/7/8 10:47
 * @description: 通用返回类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {
    /**
     * 状态码
     */
    private int code;
    /**
     * 状态描述
     */
    private String codeMsg;
    /**
     * 返回数据
     */
    private T data;
}
