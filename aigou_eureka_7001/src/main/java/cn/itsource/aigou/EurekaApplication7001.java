package cn.itsource.aigou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer// eureka的服務端
public class EurekaApplication7001 {

 public static void main(String[] args) {
     SpringApplication.run(EurekaApplication7001.class);
 }
}
