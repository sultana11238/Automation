package N_ArrayPractice;

public class MinArray {

	public static void main(String[] args) {
		int array[]= {270,38,16,25,10};
		int max=array[0];
		for (int i=1;i<array.length;i++) {
			if (array[i]>max) {
			max=array[i];
			}
		}
		
		int min=array[0];	
		for (int i=1;i<array.length;i++) {
			if (array[i]<min) {
			min=array[i];
			}
		}
	
		System.out.println("Max value is" +" " +max);
		System.out.println("Min value is" +" " +min);
		
	
	}

}
