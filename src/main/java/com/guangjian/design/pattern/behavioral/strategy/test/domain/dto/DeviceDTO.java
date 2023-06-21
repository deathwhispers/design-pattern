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
 * 基础数据设备 - DTO
 *
 * @author yanggj
 * @version V1.0
 * @date 2021-10-22 11:44
 **/
@ApiModel("基础数据设备 - DTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DeviceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备ID")
    private String deviceId;

    @ApiModelProperty(value = "设备名称")
    private String deviceName;

}
