package com.moxi.mogublog.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * json解析的工具类
 */
@Slf4j
public class JsonUtils {
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 把对象转换为json数据
     * @param obj
     * @return
     */
    public static String objectToJson(Object obj) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        try {
            String json = gson.toJson(obj);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 把json字符串转化为对象
     * @param jsonString
     * @param clazz
     * @return
     */
    public static Object jsonToOject(String jsonString, Class<?> clazz) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Object obj = null;
        try {
            obj = gson.fromJson(jsonString, clazz);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static ArrayList<?> jsonArrayToArrayList(String jsonArray) {
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .serializeNulls().create();
        ArrayList<?> list = null;
        try {
            Type listType = new TypeToken<ArrayList<?>>(){}.getType();
            list = gson.fromJson(jsonArray, listType);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return list;
    }
}