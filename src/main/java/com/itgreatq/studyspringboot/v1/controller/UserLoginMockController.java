package com.itgreatq.studyspringboot.v1.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserLoginMockController {
    @PostMapping("/v1/user/login")
    public String login(@RequestBody(required = false) Map<String, Object> param) {
        String result = null;

        if (null != param && param.get("username").equals("admin") && param.get("password").equals("111111")) {
            result = "{\"code\":20000,\"data\":{\"token\":\"admin-token\"}}";
        }
        return result;
    }
    @GetMapping("/v1/user/info")
    public String info(@RequestParam(value = "token", required = false) String token){
        String result = null;
        if (null != token && token.equals("admin-token")) {
            result = "{\"code\":20000,\"data\":{\"roles\":[\"admin\"],\"introduction\":\"I am a super administrator\",\"avatar\":\"https://avatars1.githubusercontent.com/u/26613562?s=60&v=4\",\"name\":\"Super Admin\"}}";
        }
        return result;
    }

    @PostMapping("/v1/user/logout")
    public String info(){
        String result = "{\"code\":20000,\"data\":\"success\"}";

        return result;
    }


}
