package com.tirmizee;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestApplicationTests {

	@Test
	void contextLoads() {
		assertThat(true).isEqualTo(true);
	}

}
