package com.itgreatq.studyspringboot.v1.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    /**
     * cors support
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        // 注册CORS过滤器
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 是否支持安全证书
        config.addAllowedOrigin("*"); // 允许任何域名使用
        config.addAllowedHeader("*"); // 允许任何头
        config.addAllowedMethod("*"); // 允许任何方法（post、get等）
        // 预检请求的有效期，单位为秒。
        //        config.setMaxAge(3600L);

        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
}
