package cn.itsource.aigou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient// eureka的客户端
@MapperScan(basePackages="cn.itsource.aigou.mapper") //mapper和xml都扫描了
@EnableFeignClients(basePackages="cn.itsource.aigou.client")
public class ProductApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication8002.class);
    }
}
