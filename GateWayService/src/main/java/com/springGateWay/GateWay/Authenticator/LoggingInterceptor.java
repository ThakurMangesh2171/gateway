package com.springGateWay.GateWay.Authenticator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // This method is called before the controller method is invoked.
        // You can perform pre-processing tasks here.
        System.out.println("Request received at prehandle: " + System.currentTimeMillis());
        return true; // Continue with the request handling.
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // This method is called after the controller method is invoked but before the view is rendered.
        // You can perform tasks such as modifying the model or view.
        System.out.println("Request received at: postHandle" + System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        // This method is called after the response has been sent to the client.
        // You can perform cleanup tasks or additional logging.
        System.out.println("Request received at: afterComplition " + System.currentTimeMillis());
    }
}