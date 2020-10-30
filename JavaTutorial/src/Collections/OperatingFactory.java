package Collections;

public class OperatingFactory {

	public OS getInstance(String str) {
		
		if (str.equals("open")) {
			return new Android();
		}
		else {
			return new Ios();
		}
		 
	}

}
