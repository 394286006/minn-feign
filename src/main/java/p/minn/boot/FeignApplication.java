package p.minn.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = {"p.minn"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"p.minn"})
@EnableHystrixDashboard
public class FeignApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(FeignApplication.class, args);
	}

}
