package org.zerock.mytodo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.mytodo.mappers"})
public class MytodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytodoApplication.class, args);
	}

}
