package com.dw.design.pattern.behavioral.strategy.test.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * 基础数据平台 - 机构查询对象
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:54
 */
@ApiModel("基础数据平台 - 机构查询对象")
@Data
public class OrgQueryCriteria {

    @ApiModelProperty(value = "所属路段ID")
    private String waysectionId;

    @ApiModelProperty(value = "方向(1:上行、2:下行、3:双向)")
    private String direction;

    @ApiModelProperty(value = "所属路段ID")
    private Set<String> waysectionIds;

}
