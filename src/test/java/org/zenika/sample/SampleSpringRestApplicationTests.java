package org.zenika.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.zenika.com.sample.SampleSpringRestApplication;

@SpringBootTest(classes = SampleSpringRestApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class SampleSpringRestApplicationTests {
	@Test
	void contextLoads() {
	}
	
}
