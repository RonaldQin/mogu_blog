package com.moxi.mogublog.utils.ServerInfo;

import lombok.Data;

/**
 * 内存相关信息
 */
@Data
public class Mem {
    private double total; // 内存总量
    private double used; // 已用内存
    private double free; // 剩余内存
    private double usage; // 使用率
}
