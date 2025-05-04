import java.util.Arrays;
import java.util.Scanner;

public class BInarySearchAlg {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] myArray = {3, 27, 30, 31, 43, 65, 68, 69, 73, 92, 94};
        Arrays.sort(myArray); 
      
        System.out.println("Enter the integer you want to search for: ");
        int mySearch = key.nextInt();
       int found = binarySearch(myArray, mySearch);
        if (mySearch != -1) {
        System.out.println("It took: " + found + " times to find it.");
        } else {
        	System.out.println("Not found");
        	}
        }
    
    
// Algorithmic search methodology
    public static int binarySearch(int[] userArray, int userSearch) {
        int lowEnd = 0;
        int highEnd = userArray.length - 1;
        int comparisonCounter = 0;

        while (lowEnd <= highEnd) {
        	
            comparisonCounter++;
            int middle = lowEnd + (highEnd - lowEnd) / 2;
            System.out.println(userArray[middle]);
            if (userSearch == userArray[middle]) {
                return comparisonCounter; // Return the number of comparisons
            } else if (userSearch < userArray[middle]) {
                highEnd = middle - 1;
            } else {
                lowEnd = middle + 1;
            }
        }
        return -1; // Return -1 if not found
    }
}

