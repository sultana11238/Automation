package N_ArrayPractice;

public class SumArray {

	public static void main(String[] args) {
		int array[]= {27,38,16,28,10};
		int sum=0;
		//double avg=0;
		for (int i=0; i<array.length;i++ ) {
			sum=sum+array[i];
		}
		//avg=sum/array.length;// this is done outside bc we need the sum value to get the avg
		System.out.println("Sum of the array is" +" "+sum);
		//System.out.println("Avg of the array is" +" "+avg);

	}

}
