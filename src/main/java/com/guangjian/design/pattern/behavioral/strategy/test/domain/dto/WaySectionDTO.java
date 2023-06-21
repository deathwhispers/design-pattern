package com.guangjian.design.pattern.behavioral.strategy.test.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 运营路段 - DTO
 *
 * @author yanggj
 * @version V1.0
 * @date 2021-10-22 11:44
 **/
@ApiModel(value = "运营路段 - DTO", description = "运营路段信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WaySectionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "路段ID")
    private String waysectionId;

    @ApiModelProperty(value = "路段名称")
    private String waysectionName;
}
