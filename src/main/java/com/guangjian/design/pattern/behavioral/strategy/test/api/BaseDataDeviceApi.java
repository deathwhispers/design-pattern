package com.guangjian.design.pattern.behavioral.strategy.test.api;


import com.guangjian.design.pattern.behavioral.strategy.test.domain.dto.DeviceDTO;

import java.util.List;

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
