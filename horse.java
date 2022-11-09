
//Simple horse class created by Kim Gross and expanded by Hiram Silva
//for CTE Software Development class 2022



public class horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    }
    
    public void age(){
        // what should be in a age function?
    } 
    public void changeName(String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
    public String toString(){
        return name + " " + birthYear;
        
    }
   
    public static void main(String[] args){
        horse horse1 = new horse("Silver", 2000); //This creates a horse named "Silver" that was born in 2000
        horse horse2 = new horse("Jimmy", 1997);  //This creates a horse name "Jimmy" that was born in 1997
        horse horse3 = new horse("Tim", 2012);    //This creates a horse name "Tim" that was born in 2012

        System.out.println(horse1);  //This prints out the information of "Silver"
        System.out.println(horse2);  //This prints out the information of "Jimmy"
        System.out.println(horse3);  //This prints out the information of "Tim"
        }

    
    
}
