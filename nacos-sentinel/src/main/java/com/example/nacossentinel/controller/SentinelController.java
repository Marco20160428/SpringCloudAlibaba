package com.example.nacossentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping("/getByCode/{accountCode}")
    @SentinelResource(value = "getByCode")
    public String getByCode(@PathVariable(value = "accountCode") String accountCode){
        return accountCode;
    }

    @GetMapping("/getByName/{accountName}")
    @SentinelResource(value = "getByName", blockHandler = "handleException")
    public String getByName(@PathVariable(value = "accountName") String accountName){
        return accountName;
    }

    /**
     * 自定义异常策略
     * 返回值和参数要跟目标函数一样，参数可以追加BlockException
     */
    public String handleException(String accountName, BlockException exception){
        return "达到阈值了,不要再访问了!";
    }
}
