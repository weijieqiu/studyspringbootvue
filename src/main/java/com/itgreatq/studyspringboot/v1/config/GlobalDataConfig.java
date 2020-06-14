package com.itgreatq.studyspringboot.v1.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalDataConfig  {

    @ModelAttribute(value = "SuccessResult")
    public Map<String, Object> successResult(){
        Map<String,Object> result = new HashMap<>();
        result.put("code", 20000);
        result.put("status", "success");
        result.put("data", null);
        return result;
    }

    @ModelAttribute(value = "FailureResult")
    public Map<String, Object> failureResult(){
        Map<String,Object> result = new HashMap<>();
        result.put("code", 40000);
        result.put("status", "failure");
        result.put("data", null);
        return result;
    }
}
