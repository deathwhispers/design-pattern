package com.dw.design.pattern.behavioral.strategy.test.strategy;


import com.dw.design.pattern.behavioral.strategy.test.api.OrgQueryCriteria;
import com.dw.design.pattern.behavioral.strategy.test.domain.dto.*;
import com.guangjian.design.pattern.behavioral.strategy.test.api.*;
import com.guangjian.design.pattern.behavioral.strategy.test.domain.dto.*;

import java.util.List;
import java.util.Set;

/**
 * 和基础数据平台的交互策略（直连数据库、微服务、RPC...）
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 11:28
 */
public interface InteractionStrategy {



    DeviceDTO queryByDeviceId(String deviceId);

    /**************** 设施接口 *****************/

    /**
     * 根据设施 id 查询设施信息
     *
     * @param facilitiesId 设施id
     * @return {@link FacilitiesDTO}
     */
    FacilitiesDTO queryById(String facilitiesId);

    /**************** 路段接口 *****************/

    /**
     * 根据路段 id 查询路段信息
     *
     * @param waySectionId 路段 id
     * @return {@link WaySectionDTO}
     */
    WaySectionDTO queryWaySectionById(String waySectionId);

    /**************** 组织机构接口 *****************/
    /**
     * 查询机构列表
     *
     * @param criteria {@link OrgQueryCriteria}
     * @return {@link List< OrgDTO >}
     */
    List<OrgDTO> queryAllOrg(OrgQueryCriteria criteria);

    /**************** 用户接口 *****************/
    /**
     * 查询用户
     *
     * @param userId 用户id
     * @return {@link UserDTO}
     */
    UserDTO queryByUserId(String userId);

    /**************** 权限树接口 *****************/

    Set<String> getDeviceIdsOfPeripheral();
}
