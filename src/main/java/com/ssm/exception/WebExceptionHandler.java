package com.ssm.exception;

import com.ssm.utils.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.net.BindException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {
   static Logger logger=Logger.getLogger(WebExceptionHandler.class.getName());

    @ExceptionHandler(UnLoginException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result<?> unLoginExceptionHandle(UnLoginException e) {
        logger.info("未登录");
        return Result.fail("未登录");
    }

    @ExceptionHandler(LoginStatusOutOfDateException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result<?> loginStatusOutOfDateExceptionHandle(LoginStatusOutOfDateException e) {
        return Result.fail("登录状态已过期");
    }

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result<?> bindExceptionHandle(BindException e) {
        return Result.fail("数据校验失败");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Result<?> noHandlerFoundExceptionHandle(NoHandlerFoundException e) {
        return Result.fail("请求的资源不存在");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Result<?> httpRequestMethodNotSupportedExceptionHandle(HttpRequestMethodNotSupportedException e) {
        return Result.fail("请求的方法不支持");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result<?> exceptionHandle(Exception e) {
        return Result.fail("服务器错误");
    }
}
