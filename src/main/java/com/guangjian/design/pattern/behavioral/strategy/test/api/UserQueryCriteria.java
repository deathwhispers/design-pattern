package com.guangjian.design.pattern.behavioral.strategy.test.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 基础数据平台 - 用户查询对象
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:54
 */
@ApiModel("基础数据平台 - 用户查询对象")
@Data
@Accessors(chain = true)
public class UserQueryCriteria {

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "账号")
    private String username;

    @ApiModelProperty(value = "用户名")
    private String nickName;

    @ApiModelProperty(value = "用户类型", example = "1")
    private Integer userType;

    @ApiModelProperty(value = "组织ID")
    private String orgId;

    @ApiModelProperty(value = "性别", example = "1")
    private Integer sex;

}
