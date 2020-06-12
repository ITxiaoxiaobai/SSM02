package com.ssm.interceptor;

import com.ssm.annotation.IgnoreLogin;
import com.ssm.exception.LoginStatusOutOfDateException;
import com.ssm.exception.UnLoginException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            IgnoreLogin ignoreLogin = handlerMethod.getMethodAnnotation(IgnoreLogin.class);
            if (ignoreLogin == null) {
                String token = request.getHeader("token");
                if (StringUtils.isEmpty(token)) {
                    throw new UnLoginException("未登录");
                }
                if (!StringUtils.equalsIgnoreCase(token, "abc123456")) {
                    throw new LoginStatusOutOfDateException("登录状态已过期");
                }
            }
        }
        return true;
    }
}
