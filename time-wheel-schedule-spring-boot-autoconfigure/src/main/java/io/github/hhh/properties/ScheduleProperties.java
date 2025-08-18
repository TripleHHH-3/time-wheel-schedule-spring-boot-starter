package io.github.hhh.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author huanghuihong
 * @version 1.0
 * @description:
 * @date 2025/8/18 21:16
 */
@Data
@ConfigurationProperties(prefix = "time-wheel-schedule")
public class ScheduleProperties {
	/**
	 * 任务名称
	 */
	private String name = "default";
	/**
	 * 任务描述
	 */
	private String cron = "0/5 * * * * ?";
	/**
	 * 任务主题
	 */
	private String topic = "default-topic";
	/**
	 * 任务组
	 */
	private String group = "default-group";
}
