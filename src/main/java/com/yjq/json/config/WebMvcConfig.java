package com.yjq.json.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebMvcConfig {
//    @Bean
//    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        converter.setObjectMapper(objectMapper);
//        return converter;
//    }
//    @Bean
//    ObjectMapper objectMapper(){
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM-dd"));
//        return objectMapper;
//    }
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter(){
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        converter.setGson(new GsonBuilder().setDateFormat("yyyy/MM/dd").create());
//        return converter;
//    }
//    @Bean
//    Gson gson(){
//        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//    }
    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setDateFormat("yyyy/MM/dd");
        converter.setFastJsonConfig(fastJsonConfig);
        return converter;
    }
}
