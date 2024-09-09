package com.dw.design.pattern.behavioral.strategy.test.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.management.Query;
import java.util.Set;

/**
 * 基础数据平台 - 设备查询对象
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:54
 */
@ApiModel("基础数据平台 - 设备查询对象")
@Data
@Accessors(chain = true)
public class DeviceQueryCriteria {

    @ApiModelProperty(value = "多字段模糊查询(外设sn、外设名称、位置、桩号)")
    private String blurry;

    @ApiModelProperty(value = "设备ID")
    private String deviceId;

    @ApiModelProperty(value = "设备ID")
    private Set<String> deviceIds;

    @ApiModelProperty(value = "排除的设备ID")
    private Set<String> excludeDeviceIds;

    @ApiModelProperty(value = "设备代码(设备编号)")
    private String deviceCode;

    @ApiModelProperty(value = "设备类型")
    private Set<String> deviceTypes;

    @ApiModelProperty(value = "所属设施ID")
    private String facilitiesId;

    @ApiModelProperty(value = "所属设施ID")
    private Boolean facilitiesIdIsNull;

    @ApiModelProperty(value = "所属设施ID")
    private Set<String> facilitiesIds;

    @ApiModelProperty(value = "所属路段ID")
    private String waysectionId;

    @ApiModelProperty(value = "所属路段ID")
    private Set<String> waysectionIds;

    @ApiModelProperty(value = "方向(1:上行、2:下行、3:双向)")
    private String direction;

    @ApiModelProperty(value = "产品序列号")
    private String seriaNumber;

    @ApiModelProperty(value = "工作状态")
    private String workStatus;

    @ApiModelProperty(value = "产品序列号")
    private Set<String> snList;
}
