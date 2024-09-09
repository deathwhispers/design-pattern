package com.dw.design.pattern.behavioral.strategy.test.strategy.rpc;

import com.dw.design.pattern.behavioral.strategy.test.api.OrgQueryCriteria;
import com.dw.design.pattern.behavioral.strategy.test.domain.dto.*;
import com.dw.design.pattern.behavioral.strategy.test.strategy.InteractionStrategy;
import com.guangjian.design.pattern.behavioral.strategy.test.domain.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * 交互策略 - 通过RPC获取设备（bdmp-public）
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 11:40
 */
@Component("rpc")
@RequiredArgsConstructor
public class RPCInteractionStrategy implements InteractionStrategy {
    @Override
    public DeviceDTO queryByDeviceId(String deviceId) {
        return null;
    }

    @Override
    public FacilitiesDTO queryById(String facilitiesId) {
        return null;
    }

    @Override
    public WaySectionDTO queryWaySectionById(String waySectionId) {
        return null;
    }

    @Override
    public List<OrgDTO> queryAllOrg(OrgQueryCriteria criteria) {
        return null;
    }

    @Override
    public UserDTO queryByUserId(String userId) {
        return null;
    }

    @Override
    public Set<String> getDeviceIdsOfPeripheral() {
        return null;
    }
}
