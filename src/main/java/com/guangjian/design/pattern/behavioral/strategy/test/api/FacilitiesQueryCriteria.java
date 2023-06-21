package com.guangjian.design.pattern.behavioral.strategy.test.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * 基础数据平台 - 设施查询对象
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:54
 */
@ApiModel("基础数据平台 - 设施查询对象")
@Data
public class FacilitiesQueryCriteria {

    @ApiModelProperty(value = "所属设施ID")
    private String facilitiesId;

    @ApiModelProperty(value = "所属路段ID")
    private String waySectionId;

    @ApiModelProperty(value = "所属设施类型")
    private String facilitiesType;

    @ApiModelProperty(value = "方向(1:上行、2:下行、3:双向)")
    private String direction;

    @ApiModelProperty(value = "方向(1:上行、2:下行、3:双向)")
    private Boolean parentIdIsBlank;

    @ApiModelProperty(value = "工作状态")
    private String workStatus;

    @ApiModelProperty(value = "所属设施ID")
    private Set<String> facilitiesIds;

    @ApiModelProperty(value = "所属路段ID")
    private Set<String> waySectionIds;

}
