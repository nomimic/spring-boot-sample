package nomimic.springboot.starter.config;

import nomimic.springboot.starter.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lucas Yonghee Lee on 2016. 9. 9..
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterBean() {
        FilterRegistrationBean myFilterBean = new FilterRegistrationBean();

        myFilterBean.setFilter(new MyFilter());

        return myFilterBean;
    }
}
