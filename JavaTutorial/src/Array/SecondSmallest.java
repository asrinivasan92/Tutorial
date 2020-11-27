package Array;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {1,2,3,4,5,6};
         
       int smallest = Integer.MAX_VALUE;
       int secondsmallest = Integer.MAX_VALUE;
       
       for (int i = 0; i < a.length; i++) {
		
    	   if (a[i]<smallest) {
			smallest =a[i];
		}
    	 if (a[i]>smallest && a[i]<secondsmallest) {
			secondsmallest = a[i];
		}
    	   
    	   
	   }
       System.out.println(secondsmallest);
 }

}
