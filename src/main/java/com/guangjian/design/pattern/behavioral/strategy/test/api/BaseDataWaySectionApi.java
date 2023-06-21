package com.guangjian.design.pattern.behavioral.strategy.test.api;

import com.guangjian.design.pattern.behavioral.strategy.test.domain.dto.WaySectionDTO;

/**
 * 基础数据平台 - 路段接口
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:13
 */
public interface BaseDataWaySectionApi {

    // 根据 id 查询路段详情
    WaySectionDTO queryWaySectionById(String waySectionId);
}
