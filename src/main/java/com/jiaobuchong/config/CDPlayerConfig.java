package com.jiaobuchong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jiaobuchong.dao.CompactDisc;
import com.jiaobuchong.soundsystem.CDPlayer;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {
	@Bean(name="cDPlayer")
	public CDPlayer cdPlayer(CompactDisc heyGirl) {
		return new CDPlayer(heyGirl);
	}
}
