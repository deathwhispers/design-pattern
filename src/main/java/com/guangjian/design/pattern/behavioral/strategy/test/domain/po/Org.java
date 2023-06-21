package com.guangjian.design.pattern.behavioral.strategy.test.domain.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 组织机构 实体
 *
 * @author yanggj
 * @version V1.0
 * @date 2021-09-24 16:32
 **/
@ApiModel(value = "组织机构", description = "组织机构信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织ID")
    private String orgId;

    @ApiModelProperty(value = "组织名称")
    private String orgName;

}
