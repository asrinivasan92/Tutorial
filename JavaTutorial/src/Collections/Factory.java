package Collections;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Factory design pattern is used when we have a super class with multiple sub classes 
		// Instantiation of class in a single place 
		// Interface OS - Multiple use of the OS such as - Android , ios , Windows OS
		
		OperatingFactory os = new OperatingFactory();
		OS obj = os.getInstance("open");
		System.out.println(obj);
		obj.spec();
		
	}

}
