package shop.gateway.predicate;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wh
 * @date 2022/8/5 13:57
 * @description:  接收配置文件中的参数
 */
@Data
public class NameRoutePredicateConfig implements Serializable {

    private static final long serialVersionUID = -3289515863427972825L;

    private String name;
}
