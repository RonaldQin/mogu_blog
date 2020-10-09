package com.moxi.mogublog.utils.ServerInfo;

import lombok.Data;

/**
 * CPU相关信息
 */
@Data
public class Cpu {
    private int cpuNum; // 核心数
    private double total; // CPU总的使用率
    private double sys; // CPU系统使用率
    private double used; // CPU用户使用率
    private double wait; // CPU当前等待率
    private double free; // CPU当前空闲率
}
