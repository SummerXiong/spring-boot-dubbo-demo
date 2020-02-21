package com.summer.consumer.controller;

import com.summer.base.dto.ProviderTestDTO;
import com.summer.base.service.IProviderSerice;
import com.summer.base.vo.ResultVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/2/21 9:28
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Reference
    private IProviderSerice providerSerice;

    @GetMapping("list")
    public ResultVO queryList(){
        List<ProviderTestDTO> list =  providerSerice.queryList();
        return new ResultVO.Builder<>().code(200).message("操作成功").data(list).build();
    }

}
