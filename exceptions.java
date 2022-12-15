

public class exceptions {
    public static void main(String[] args){

        int zero = 0; //This declares some integer variables
        int five = 5;

        try{ //This checks the code in the brackets for exceptions
        System.out.println(five/zero); //This prints out the quotient of 5 and 0
        System.out.println("line after"); //This prints "line after"
        } 

        catch(Exception e){ //This tells the program what to do if an exception is found
            System.out.println("Sorry! you can't divide by zero."); //This prints out an error message
        }

        System.out.println("Crisis avoided"); //This prints "Crisis avoided"

        int[] array = {1, 2, 3, 4, 5}; // This creates an array called "array" with the values 1, 2, 3, 4, 5

        try{ //This checks the code in the brackets for exceptions
        System.out.println(array[5]); //This prints out a value of the array that is not defined
        }

        catch(Exception e){ //This tells the program what to do if an exception is found
            System.out.println("Please call a valid value"); //This prints out an error message
        } 
    }

}
