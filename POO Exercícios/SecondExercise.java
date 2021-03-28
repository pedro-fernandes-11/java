package package_lpoo_classes;
import java.util.Random;

public class SecondExercise {
	public static void main(String[] args) {
		class Arrays{
			public int[] st_array;
			public int[] nd_array = new int[10];
			public Arrays(int[] first) {
				this.st_array = first;
			}
			public void printFirst() {
				for(int i = 0;i < this.st_array.length;i++) {
					System.out.print(this.st_array[i]+" ");
				}
			}
			public void printSecond() {
				for(int i = 0;i < this.st_array.length;i++) {
					this.nd_array[i] = this.st_array[i] + this.returnArray(i);
				}
				for(int i = 0;i < this.nd_array.length;i++) {
					System.out.print(this.nd_array[i]+" ");
				}
			}
			public int returnArray(int i) {	
				int act_i = i - 1;
				if(act_i < 0) {
					return 0;
				}else if(act_i == 0) {
					return this.nd_array[0];
				}else {
					return this.nd_array[act_i] + this.returnArray(act_i);
				}
			}
		}
		Random generate = new Random();
		int myArray[] = {2, 1, 20, 5, 17, 19, 14, 4, 18, 2};
		/*for(int i = 0;i < 10;i++) {
			myArray[i] = generate.nextInt(21);
		}*/
		Arrays exercise = new Arrays(myArray);
		System.out.print("Original array: ");
		exercise.printFirst();
		System.out.print("\n");
		System.out.print("Modified array: ");
		exercise.printSecond();
	}
}
