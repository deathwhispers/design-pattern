package com.dw.design.pattern.behavioral.strategy.test.api;

import java.util.Set;

/**
 * 基础数据平台 - 权限树
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2023/3/14 11:10
 */
public interface BaseDataPermissionTreeApi {

    Set<String> getDeviceIdsOfPeripheral(UserPermissionExtReqVO reqVO);

}
