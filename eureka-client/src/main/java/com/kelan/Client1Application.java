package com.kelan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by xd031 on 2017/9/26.
 * 8502,8503,8504
 * http://localhost:15672/#/
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class Client1Application {
  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(Client1Application.class);
    application.run();
  }
}
