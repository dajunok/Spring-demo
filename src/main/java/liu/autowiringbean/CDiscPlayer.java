package liu.autowiringbean;

public class CDiscPlayer {
	private CompactDisc compactDisc;	
	public void setCompactDisc(CompactDisc compactDisc) {
		System.out.println("CDiscPlayer --> CompactDisc");
		this.compactDisc=compactDisc;
	}	
	public void play() {
		compactDisc.play();
	}
	
	@SuppressWarnings("unused")
	private DigitalVideo digitalVideo;
	public void setDigitalVideo(DigitalVideo digitalVideo) {
		System.out.println("CDiscPlayer --> DigitalVideo");
		this.digitalVideo = digitalVideo;
	}
}
