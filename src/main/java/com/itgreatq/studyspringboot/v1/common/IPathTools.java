package com.itgreatq.studyspringboot.v1.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
@Component
public class IPathTools {
    /**
     * 获取 Springboot 项目中的 resources 路径
     * @return Springboot 项目中的 resources 路径
     * @throws FileNotFoundException
     */
    public String getSpringBootResourcesPath() throws FileNotFoundException {
        return ResourceUtils.getURL("classpath:").getPath();
    }
}
