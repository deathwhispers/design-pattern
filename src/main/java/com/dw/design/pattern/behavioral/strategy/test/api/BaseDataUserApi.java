package com.dw.design.pattern.behavioral.strategy.test.api;


import com.dw.design.pattern.behavioral.strategy.test.domain.dto.UserDTO;


/**
 * 基础数据平台 - 用户接口
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2022/6/22 10:13
 */
public interface BaseDataUserApi {

    // 查询用户
    UserDTO queryByUserId(String userId);
}
