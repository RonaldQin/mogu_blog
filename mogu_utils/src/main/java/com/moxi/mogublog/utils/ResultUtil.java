package com.moxi.mogublog.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回统一接口
 */
public class ResultUtil {

    public static String result(Object code, String data) {
        Map<Object, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("data", data);
        return JsonUtils.objectToJson(map);
    }
}
