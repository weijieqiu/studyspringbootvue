package com.itgreatq.studyspringboot.studyfreemarker.controller;


import com.itgreatq.studyspringboot.studyfreemarker.comman.FreemarkerConfigSingleton;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/freemarker")
public class TestFreemarkerController {

    @Autowired
    FreemarkerConfigSingleton freemarkerConfigSingleton;

    @GetMapping("/testFreemarker")
    public void testFreemarker(){
        Configuration configuration = freemarkerConfigSingleton.getCfg();
        Map root = new HashMap();
        root.put("user", "Big Joe");
        Map latest = new HashMap();
        root.put("latestProduct", latest);
        latest.put("url", "products/greenmouse.html");
        latest.put("name", "green mouse");

        try {
            Template temp = configuration.getTemplate("test.ftl");
            String path = ResourceUtils.getURL("classpath:").getPath();
            Writer out = new OutputStreamWriter(new FileOutputStream(path + File.separator + "templates"+ File.separator + "test.sql"), StandardCharsets.UTF_8);
            temp.process(root, out);
            out.flush();
            out.close();
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }finally {

        }
    }


}
