package liu.spelwiringbean;
	
public class Poem {
	private static String[] LINES= {
			"床前明月光，",
            "疑是地上霜。",
            "举头望明月，",
            "低头思故乡。"
     };
	
	public void perform() {
		for(String line:LINES) {
			System.out.println(line);
		}
	}

}
