import java.util.Arrays;
//Create a while loop that stores the numbers
//one through fifty in an array.
//nice work
public class Exercises {
	
	public static void main(String[] args) {
		
		int[] nums = new int[50];
		int counter = 1;
		int i = 0;
		
		while (i < nums.length){
			nums[i] = counter;
			i++;
			counter++;
		}
			System.out.println(Arrays.toString(nums));
	
	
	//Use a do while loop to add five to 
	//all the odd numbers in the array.	
	
		i = 0;
		
		do {
			int currentElement = nums [i];
			//check is is odd 
			if(currentElement % 2 != 0) {
				nums[i] = currentElement + 5;
			}
			i++;
			
		}while (i < nums.length);
		
		System.out.println(Arrays.toString(nums));
	
	
	//Use a for loop to print each element of the array. 
	// Unless that element is a multiple of four or six. 
	//If it's a multiple of four print FOUR!!. 
	//If it's a multiple of six print SIX!!!. 
	//If it's a multiple of both print FOUR!!SIX!!!.

	for(int x = 0; x < nums.length; x++) {
		int currentElement = nums [x];
		if(currentElement % 4 == 0 && currentElement % 6 ==0)
			System.out.println("FOUR!! SIX!!");
		else if (currentElement % 4 == 0)
			System.out.println("SIX!!");
		else
			System.out.println(currentElement);
	}
  }
}

//contribution

