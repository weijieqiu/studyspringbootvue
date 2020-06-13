package com.itgreatq.studyspringboot.studyfreemarker.comman;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
@Component
public class FreemarkerConfigSingleton {
    private volatile static FreemarkerConfigSingleton freemarkerConfigSingleton;

    private Configuration cfg =null;

    public FreemarkerConfigSingleton() {
        cfg = new Configuration(Configuration.VERSION_2_3_22);
        try {
            String path = ResourceUtils.getURL("classpath:").getPath();
            cfg.setDirectoryForTemplateLoading(new File(path + File.separator + "/templates"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.DEBUG_HANDLER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static FreemarkerConfigSingleton getFreemarkerConfigSingleton(){
        if (freemarkerConfigSingleton == null){
            synchronized (FreemarkerConfigSingleton.class){
                if (freemarkerConfigSingleton == null){
                    freemarkerConfigSingleton = new FreemarkerConfigSingleton();
                }
            }
        }
        return freemarkerConfigSingleton;
    }

    public Configuration getCfg() {
        FreemarkerConfigSingleton.getFreemarkerConfigSingleton();
        return cfg;
    }
}
