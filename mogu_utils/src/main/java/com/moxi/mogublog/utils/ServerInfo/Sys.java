package com.moxi.mogublog.utils.ServerInfo;

import lombok.Data;

/**
 * 系统相关信息
 */
@Data
public class Sys {
    private String computerName; // 服务器名称
    private String computerIp; // 服务器IP
    private String userDir; // 项目路径
    private String osName; // 操作系统
    private String osArch; // 系统架构

}
