package com.summer.base.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/2/21 9:13
 */
@Data
public class ResultVO<T> implements Serializable {

    private int code;
    private String message;
    private T data;

    private ResultVO() {}

    private ResultVO(ResultVO<T> resultVO) {
        this.code = resultVO.code;
        this.message = resultVO.message;
        this.data = resultVO.data;
    }

    public static class Builder<T>{

        private ResultVO<T> resultVO;

        public Builder(){
            resultVO = new ResultVO<>();
        }

        public Builder code(int code){
            resultVO.code = code;
            return this;
        }

        public Builder message(String message){
            resultVO.message = message;
            return this;
        }

        public Builder data(T data){
            resultVO.data = data;
            return this;
        }

        public ResultVO<T> build(){
            return new ResultVO<>(resultVO);
        }

    }

}
