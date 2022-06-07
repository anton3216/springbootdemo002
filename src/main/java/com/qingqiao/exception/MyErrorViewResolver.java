package com.qingqiao.exception;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class MyErrorViewResolver extends DefaultErrorViewResolver {
    public MyErrorViewResolver(ApplicationContext applicationContext, ResourceProperties resourceProperties) {
        super(applicationContext, resourceProperties);
    }
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        /*Set<Map.Entry<String, Object>> entries = model.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println("key : \t" + entry.getKey() + "\t value : \t" + entry.getValue());
        }*/
        Map<String, Object> map = new HashMap<>();
        if ((Integer)model.get("status") == 500) {

            map.put("timestamp", model.get("timestamp"));
            map.put("status", model.get("status"));
            map.put("error", model.get("error"));
            map.put("path", model.get("path"));
            map.put("message", "服务器内部错误!");
        }


        return new ModelAndView("/aaa/123", map);
    }
}
