package Collections;

public class shopbuilder {

	private String os;
	private int ram;
	private String processor;
	
	
	public shopbuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public shopbuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public shopbuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone() {
		
		return new Phone(os,ram,processor);
	}

}
