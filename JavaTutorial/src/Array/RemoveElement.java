package Array;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] number = new int[10];
         
         number[0] = 1;
         number[1] = 2;
         number[2] = 5;
         number[3] = 6;
         number[4] = 7;
         
         int Size = number.length;
         int target = 2;
         
         for (int i = target; i < number.length; i++) {
			number[i] = number[i+1];
		}
         number[Size-1]=0;
          Size--;
          System.out.println(number);
	}

}
