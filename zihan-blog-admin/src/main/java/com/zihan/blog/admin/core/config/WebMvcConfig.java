package com.zihan.blog.admin.core.config;

import com.zihan.blog.admin.core.interceptor.RememberAuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/7/15 15:03
 * @since 1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private RememberAuthenticationInterceptor rememberAuthenticationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(rememberAuthenticationInterceptor)
                .excludePathPatterns("/passport/**", "/error/**", "/assets/**", "/getKaptcha/**", "favicon.ico")
                .addPathPatterns("/**");
    }
}
