package com.moxi.mogublog.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * String工具类
 */
@Slf4j
public class StrUtils {
    /**
     * 获取UUID，去掉了 -
     * @return
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        log.debug("获取32位的UUID的调试日志-->>" + uuid);
        return uuid;
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        if (str == null || str.isEmpty()) return false;
        return true;
    }

    /**
     * 获取三位数随机字符串
     * @return
     */
    public static String getRandom() {
        int number;
        while (true) {
            number = (int) (Math.random()*1000);
            if (number >= 100 && number < 1000) break;
        }
        String string = String.valueOf(number);
        log.debug("获取3位的随机码字符串的调试日志-->>" + string);
        return string;
    }
}
