package com.moxi.mogublog.base.enums;

/**
 * 七牛云存储空间枚举类
 */
public enum EQiNiuArea {
    z0("z0", "华东"),
    z1("z1", "华北"),
    z2("z2", "华南"),
    na0("na0", "北美"),
    as0("as0", "东南亚");

    private final String code;
    private final String name;

    EQiNiuArea(String code, String name) {
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
