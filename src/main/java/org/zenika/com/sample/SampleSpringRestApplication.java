package org.zenika.com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.zalando.logbook.DefaultCorrelationId;
import org.zalando.logbook.Logbook;

@SpringBootApplication(scanBasePackages = { "org.zenika.com" })
public class SampleSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringRestApplication.class, args);
	}

	@Bean
	public Logbook logbook() {
		return Logbook.builder().correlationId(new DefaultCorrelationId()).build();
	}

}
