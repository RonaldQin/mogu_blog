package com.moxi.mogublog.utils;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.List;

public class AspectUtil {

    /**
     * 获取以类路径为前缀的键
     * @param point
     * @param prefix
     * @return
     */
    public String getKey(JoinPoint point, String prefix) {
        String keyPrefix = "";
        if (!StringUtils.isEmpty(prefix)) {
            keyPrefix += prefix;
        }
        keyPrefix += getClassName(point);
        return keyPrefix;
    }

    /**
     * 获取当前切面指定的方法所在的class
     * @param point
     * @return
     */
    public String getClassName(JoinPoint point) {
        return point.getTarget().getClass().getName().replaceAll("\\.", "_");
    }

    public Method getMethod(JoinPoint point) throws NoSuchMethodException {
        Signature sig = point.getSignature();
        MethodSignature msig = (MethodSignature) sig;
        Object target = point.getTarget();
        return target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
    }

    public String parseParams(Object[] params, String bussinessName) {
        if (bussinessName.contains("{") && bussinessName.contains("}")) {
            List<String> result = RegexUtils.match(bussinessName, "(?<=\\{)(\\d+)");
            for (String s : result) {
                int index = Integer.parseInt(s);
                bussinessName = bussinessName.replaceAll("\\{" + index + "}", JSON.toJSONString(params[index-1]));
            }
        }
        return bussinessName;
    }
}
