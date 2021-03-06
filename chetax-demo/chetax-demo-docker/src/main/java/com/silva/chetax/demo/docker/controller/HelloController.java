package com.silva.chetax.demo.docker.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/**
	 * 会用类似下面这样的请求地址向k8s api服务器发请求。
	 * <p>https://10.96.0.1/api/v1/namespaces/default/services
	 */
	@Autowired
	private DiscoveryClient discoveryClient;
	
    /**
     * 探针检查响应类
     * @return
     */
    @RequestMapping("/health")
    public String health() {
        return "health";
    }
    
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/services")
	public List<String> services() {
		return this.discoveryClient.getServices();
	}

}
