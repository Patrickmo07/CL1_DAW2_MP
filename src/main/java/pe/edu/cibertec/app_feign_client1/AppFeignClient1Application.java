package pe.edu.cibertec.app_feign_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppFeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppFeignClient1Application.class, args);
	}

}
