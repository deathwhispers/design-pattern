package com.guangjian.design.pattern.behavioral.strategy.test.strategy;

import com.guangjian.design.pattern.behavioral.strategy.test.configuration.Strategy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/23 17:35
 */
public class InteractionStrategyDispatcher {

    private final Map<Strategy, InteractionStrategy> STRATEGY_MAP;
    private final Strategy strategy;

    public InteractionStrategyDispatcher(List<InteractionStrategy> interactionStrategyLists, Strategy strategy) {
        STRATEGY_MAP = interactionStrategyLists.stream().collect(Collectors.toMap(
                s -> Strategy.valueOf(s.getClass().getAnnotation(Component.class).value()),
                s -> s
        ));
        String s = Strategy.LOCAL.toString();
        this.strategy = strategy;
    }

    /**
     * 获取策略类型
     *
     * @return {@link InteractionStrategy}
     */
    public InteractionStrategy getStrategy() {
        return STRATEGY_MAP.get(this.strategy);
    }

/*

    // 设备接口
    public List<DeviceDTO> queryAllDevice(DeviceQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllDevice(criteria);
    }

    // 设施接口
    public List<FacilitiesDTO> queryAllTunnel(FacilitiesQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllTunnel(criteria);
    }

    public List<String> queryAllFacilityIds(FacilitiesQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllFacilityIds(criteria);
    }

    public FacilitiesDTO queryById(String facilitiesId) {
        return STRATEGY_MAP.get(this.strategy).queryById(facilitiesId);
    }

    // 路段接口
    public List<WaySectionDTO> queryAllWaySection(WaySectionQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllWaySection(criteria);
    }

    // 机构接口
    public List<OrgDTO> queryAllOrg(OrgQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllOrg(criteria);
    }

    // 用户接口
    public List<UserDTO> queryAllUser(UserQueryCriteria criteria) {
        return STRATEGY_MAP.get(this.strategy).queryAllUser(criteria);
    }
*/

}
