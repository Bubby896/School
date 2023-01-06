//This is program SimpleBubble. It was made by Hiram Silva
public class SimpleBubble {

        static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
        
                    int temp;   //I am not sure what the purpose of this chunk of code is. Please explain it. Thanks!
        
        temp=arrayToSwap[lowerIndex];
        
        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
        
        arrayToSwap[lowerIndex+1]=temp;
        
        return arrayToSwap;
        
        }
    public static void main(String[] args){
        boolean doSwap = true;    //This tells to code to swap elements

    
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the unsorted array.

    System.out.println("Unsorted Array:");    //This prints out the name of the unsorted array and the unsorted array
    for (int i = 0; i < arrayToSort.length; i++){
        System.out.print(arrayToSort[i]+ ", ");
    }

        while (doSwap){
                doSwap = false;   //This prevents the array element swapping from looping after the array has been sorted

            for (int i = 0; i < arrayToSort.length - 1; i++){   //This checks if two values in the array need to be swapped
                if (arrayToSort[i] > arrayToSort[i+1]){
                   arrayToSort = swapTwoArrayElements(arrayToSort, i);   //This swaps the values in the array
                   doSwap = true;
                }
            }
        }
        System.out.println("");   //This adds a gap in between the unsorted array and the sorted array to make the output more organized
        System.out.println("");
        
        System.out.println("Sorted Array:");    //This prints out the name of the sorted array and the sorted array
        for (int i = 0; i < arrayToSort.length; i++){
                System.out.print(arrayToSort[i]+ ", ");
        }
        
    }
}
