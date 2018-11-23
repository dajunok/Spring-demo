package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	@Autowired(required=true)
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}

	public void play() {
		cd.play();
	}
}
