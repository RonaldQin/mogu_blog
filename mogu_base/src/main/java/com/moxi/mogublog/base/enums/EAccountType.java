package com.moxi.mogublog.base.enums;

/**
 * 社交账号类型枚举类
 */
public enum EAccountType {
    EMail("1", "邮箱"),
    QQNumber("2", "QQ号"),
    QQGroup("3", "QQ群"),
    Github("4", "Github"),
    Gitee("5", "Gitee"),
    WeChat("6", "微信");

    private final String code;
    private final String name;

    EAccountType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
