public class ReverseNum {

	public static void main(String[] args) {
		int num =1;
       for(int row=1; row<=6; row++) {
    	  for(int column=6; column>=row; column--) {
           System.out.print(num + " ");
           num++;
    	  }
    	  System.out.println();
    	 num=1;
	}
	}
}
