package com.jiaobuchong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jiaobuchong.dao.CompactDisc;
import com.jiaobuchong.soundsystem.SgtPeppers;

@Configuration
public class CDConfig {
	@Bean
	public CompactDisc heyGirl() {
		return new SgtPeppers();
	}

}
