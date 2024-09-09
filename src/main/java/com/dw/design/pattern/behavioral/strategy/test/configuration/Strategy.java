package com.dw.design.pattern.behavioral.strategy.test.configuration;

/**
 * 策略
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/11/3 16:27
 */
public enum Strategy {
    // 本地直接查库
    LOCAL,
    // 微服务调用
    MICRO_SERVICE,
    // 远程调用
    RPC
}