package com.guangjian.design.pattern.behavioral.strategy.test.strategy.microservice;

import com.guangjian.design.pattern.behavioral.strategy.test.api.OrgQueryCriteria;
import com.guangjian.design.pattern.behavioral.strategy.test.domain.dto.*;
import com.guangjian.design.pattern.behavioral.strategy.test.strategy.InteractionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * 交互策略 - 微服务
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 11:40
 */
@Component("microservice")
@RequiredArgsConstructor
public class MicroserviceInteractionStrategy implements InteractionStrategy {
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
