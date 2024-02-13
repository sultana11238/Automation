package N_ArrayPractice;
// we are trying to find the largest + smallest number  in an array  
public class MaxArray {

	public static void main(String[] args) {
		int array[]= {300,30,10,57,2,95};
		//int max=array[0];// making a dummy variable which is currently holding the value for 20 or location 1
//		for (int i=1;i<array.length;i++){ //starting from location 1 we are moving through the numbers until the 'new' max is the largest number in the array
//		if (array[i]>max) {
//			max=array[i];
//			}
//		}
		//System.out.println("Max value from array is:" + max);
		
		int min =array[0];
		for (int i=1;i<array.length;i++) {
			if (array[i]<min) {
				min =array[i];
			}
		}
		System.out.println("Min value from array is:" + " " + min);
		
		
		
		
	}

}
