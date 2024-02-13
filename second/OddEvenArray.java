package N_ArrayPractice;

public class OddEvenArray {

	public static void main(String[] args) {
		int array[]= {27,38,16,25,10};
		for (int i=0;i<array.length;i++) {
		if(array[i]%2==0) {
			System.out.println(array[i] + "is an even number");
		}
		else {
				System.out.println(array[i]+ "is an odd number");
			}
		}

	}

}
