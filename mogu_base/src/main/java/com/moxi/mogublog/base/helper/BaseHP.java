package com.moxi.mogublog.base.helper;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

/**
 * HP基类
 */
public class BaseHP implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>();
        return map;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (BaseHP.applicationContext == null) {
            BaseHP.applicationContext = applicationContext;
        }
    }

    // 通过name获取Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    // 通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    // 通过name，以及clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }
}
