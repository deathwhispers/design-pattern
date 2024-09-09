package com.dw.design.pattern.behavioral.strategy.test.api;


import com.dw.design.pattern.behavioral.strategy.test.domain.dto.OrgDTO;

import java.util.List;

/**
 * 基础数据平台 - 机构接口
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:13
 */
public interface BaseDataOrgApi {

    // 查询所有的终端箱设备
    List<OrgDTO> queryAllOrg(OrgQueryCriteria criteria);
}
