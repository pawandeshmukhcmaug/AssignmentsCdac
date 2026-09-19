
public class RepeatNum {

	public static void main(String[] args) {
		int num =1;
       for(int row=1; row<=6; row++) {
    	  for(int column=1; column<=row; column++) {
           if(num<=10) System.out.print(num + " ");
           num++;
    	  }
    	  System.out.println();
    	  num=1;
	}
	}
}
