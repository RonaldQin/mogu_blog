package com.moxi.mogublog.utils.ServerInfo;

import lombok.Data;

/**
 * JVM相关信息
 */
@Data
public class Jvm {
    private String name; // 虚拟机名称
    private double total; // 当前JVM占用的内存总数(M)
    private double max; // JVM最大可用内存总数(M)
    private double free; // JVM空闲内存(M)
    private double used; // JVM可用内存(M)
    private String version; // JDK版本
    private String home; // JDK路径
    private double usage; // 使用率
    private String startTime; // JDK启动时间
    private String runTime; // JDK运行时间
}
