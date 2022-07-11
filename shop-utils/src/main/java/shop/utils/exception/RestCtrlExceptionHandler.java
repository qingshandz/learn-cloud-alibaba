package shop.utils.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import shop.utils.constants.HttpCode;
import shop.utils.resp.Result;

/**
 * @author wh
 * @date 2022/7/8 10:29
 * @description:
 */
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(RestCtrlExceptionHandler.class);

    /**
     * 全局异常处理，统一返回状态码
     */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        logger.error("服务器抛出了异常：{}", e);
        return new Result<String>(HttpCode.FAILURE, "执行失败", e.getMessage());
    }
}
