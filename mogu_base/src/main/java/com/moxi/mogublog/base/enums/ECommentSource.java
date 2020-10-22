package com.moxi.mogublog.base.enums;

/**
 * 评论来源枚举类
 */
public enum ECommentSource {
    ABOUT("ABOUT", "关于我"),
    BLOG_INFO("BLOG_INFO", "博客详情"),
    MESSAGE_BOARD("MESSAGE_BOARD", "留言板");

    private final String code;
    private final String name;

    ECommentSource(String code, String name) {
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
