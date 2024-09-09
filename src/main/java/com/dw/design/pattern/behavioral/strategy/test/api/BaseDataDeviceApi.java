package com.dw.design.pattern.behavioral.strategy.test.api;


import com.dw.design.pattern.behavioral.strategy.test.domain.dto.DeviceDTO;

/**
 * 基础数据平台 - 设备接口
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:13
 */
public interface BaseDataDeviceApi {

    DeviceDTO queryByDeviceId(String deviceId);
}
