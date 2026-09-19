
public class SumArray {
	 static void CheckDuplicate(int[] arr) {
		for(int value=0; value<arr.length; value++) {
			for(int duplicate=value+1; duplicate<arr.length; duplicate++) {
				if(arr[value]==arr[duplicate]) {
					System.out.println("duplicate value is :"+arr[value]);}
				}
			}
	 } 
	 static void sum(int[] arr,int[] copy) {
		 int sum = 0;
		   for(int i=0; i<arr.length; i++) {
			   sum = sum+arr[i];
			   copy[i] = arr[i];
		   }
		   System.out.println("Sum is : "+ sum);
		   System.out.println("copied values are :");
		   int Average = sum/arr.length;
		   for(int i=0; i<arr.length; i++) {
			   System.out.print(copy[i]+" ");
		   }
		 System.out.println("average is : " + Average);
	 }
	 
	 static void minmax(int[] arr){
		 int max = arr[0];
	     int min = arr[0];
		 for(int i=1; i<arr.length; i++) {
	      if(arr[i]>max) {
				   max = arr[i];
			   }
			  }
		 for(int i=1; i<arr.length; i++) {
			   if(arr[i]<min) {
				   min = arr[i];
			   }
			  }
		   System.out.println("max value is : "+max);
		   System.out.println("min value is : "+min); 
	 }
	 static void reversedArr(int[] arr) {
		 for(int i=0; i<arr.length/2; i++) {
			   int temp = arr[i];
			   arr[i] = arr[arr.length-1-i];
			   arr[arr.length-1-i] = temp;
					     }
		   System.out.println("reversed arrAY is :");
		   for(int i=0; i<arr.length; i++) {
			   System.out.print(arr[i]+" ");
		   }
	 }
	 static void CheckTwoArray(int[] arr,int[] arr2) {
		 System.out.println("enter value of second array :");
		 for(int i =0; i<arr.length; i++) {
			   arr2[i] = Input.getInt();
		   }
	
		 for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) { 
			 if(arr[i] == arr2[i]) {
				 System.out.println(arr[i]+ " is the common value ");
			 }
			}
		 }
 }
     public static void main(String[] args) {
	   System.out.println("enter the size of array : ");
	 
	   int size = Input.getInt();
	   int[] arr = new int[size];
	   int[] arr2 = new int[size];
	   int[] copy = new int[size];
	   System.out.println("enter the values of array : ");
	 
	   for(int i =0; i<size; i++) {
		   arr[i] = Input.getInt();
	   }
	   sum(arr,copy);
	   minmax(arr);
	   CheckDuplicate(arr);
	   reversedArr(arr); 
	   CheckTwoArray(arr,arr2);
	   
   }
}
