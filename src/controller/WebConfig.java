package controller;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import interceptor.TestInterceptor2;

public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TestInterceptor2()).addPathPatterns("/**/do"); // excludePathPatterns
		super.addInterceptors(registry);
	}
	
	@Override  
    public void addViewControllers(ViewControllerRegistry registry){  
        registry.addViewController("/login222").setViewName("login222");  
    }  

}