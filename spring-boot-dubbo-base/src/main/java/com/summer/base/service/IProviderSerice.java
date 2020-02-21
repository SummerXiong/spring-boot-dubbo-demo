package com.summer.base.service;

import com.summer.base.dto.ProviderTestDTO;

import java.util.List;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *      RPC接口
 * @date: 2020/2/21 9:19
 */
public interface IProviderSerice {

    List<ProviderTestDTO> queryList();

}
