
public class array {

	static int [] values = new int [10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		values [0] = 10;
	
		values [9] = 10; // a[a.length-1] = 10
		
		System.out.println(values[0]);
		System.out.println(values[9]);
		
		for (int i = 0; i < values.length; i ++)
			System.out.println(values[i]);	
	}

}
