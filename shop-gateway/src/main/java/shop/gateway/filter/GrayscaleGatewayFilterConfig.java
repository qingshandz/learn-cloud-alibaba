package shop.gateway.filter;

import lombok.Data;

/**
 * @author wh
 * @date 2022/8/5 14:43
 * @description: 接收配置参数
 */
@Data
public class GrayscaleGatewayFilterConfig {
    private static final long serialVersionUID = 983019309000445082L;
    private boolean grayscale;
}
