package com.summer.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *  RPC接口DTO
 *  注意这里要实现序列化接口
 * @date: 2020/2/21 9:10
 */
@Data
public class ProviderTestDTO implements Serializable {
    // ID
    private int id;
    // 名字
    private String name;
    // 序号
    private Integer number;

}
