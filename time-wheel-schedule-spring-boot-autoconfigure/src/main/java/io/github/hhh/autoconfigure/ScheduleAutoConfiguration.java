package io.github.hhh.autoconfigure;

import io.github.hhh.properties.ScheduleProperties;
import io.github.hhh.test.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huanghuihong
 * @version 1.0
 * @description:
 * @date 2025/8/17 11:29
 */
@Configuration
@EnableConfigurationProperties(ScheduleProperties.class)
public class ScheduleAutoConfiguration {
	@Bean
	public Test test() {
		System.out.println("ScheduleAutoConfiguration test bean initialized");
		return new Test();
	}
}
