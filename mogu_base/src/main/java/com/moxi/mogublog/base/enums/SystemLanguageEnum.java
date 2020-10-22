package com.moxi.mogublog.base.enums;

public enum SystemLanguageEnum {
    ZH("zh", "中文"), // 中文
    EN("en", "英文");

    private final String code;
    private final String name;

    SystemLanguageEnum(String code, String name) {
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
