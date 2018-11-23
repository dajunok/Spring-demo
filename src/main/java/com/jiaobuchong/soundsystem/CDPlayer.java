package com.jiaobuchong.soundsystem;

import com.jiaobuchong.dao.CompactDisc;
import com.jiaobuchong.dao.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}
	
	public void play() {
		cd.play();
	}

}
