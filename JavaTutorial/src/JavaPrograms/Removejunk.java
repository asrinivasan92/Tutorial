package JavaPrograms;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String a = "dhdqdjqdqwjdjqwd@###2121332";
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
	}

}
