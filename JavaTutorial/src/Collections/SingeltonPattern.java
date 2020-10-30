package Collections;

public class SingeltonPattern {

	
	// Singleton class is a class thathas only one object or one instance of a class
	// How to seign singleto pattern
	//1. constructor is always private 
	//2. Write a static method(getinstance) that has a return type of object of the singleton class (Lazy initialization) 
	
	private static SingeltonPattern NewsingeltonPattern =null;
	public String str;
	
	private SingeltonPattern() {
		str= "Hi how are you";
	}
	
	public static SingeltonPattern getInstance() {
		
		if (NewsingeltonPattern==null) {
			NewsingeltonPattern = new SingeltonPattern();
		}
		return NewsingeltonPattern;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingeltonPattern x = SingeltonPattern.getInstance();
		SingeltonPattern y = SingeltonPattern.getInstance();
		SingeltonPattern z = SingeltonPattern.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
