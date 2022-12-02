import java.util.ArrayList;
import java.util.Collections;

public class bowlingBall implements Comparable<bowlingBall>{
    String color;  //Color of the bowling ball
    int weight;  //Weight of the bowling ball
    int size;  //Size of the bowling ball

public bowlingBall(String ballColor, int ballWeight, int ballSize){ //The bowlingBall constructor needs the balls color, weight, and size

    color = ballColor;  // Assigns the color of the ball to ballColor that was sent in the constructor
    weight = ballWeight;  // Assigns the weight of the ball to ballWeight that was sent in the constructor
    size = ballSize;  // Assigns the size of the ball to ballSize that was sent in the constructor

}

@Override
public int compareTo(bowlingBall o) {

    return color.charAt(0) - o.color.charAt(0);

}

public String toString(){
    return color + " " + size + " cm " + weight + " lb";
}

public static void main(String[] args){
    bowlingBall Ball2 = new bowlingBall("Blue", 12, 16);  //This creates a blue bowling ball
    bowlingBall Ball1 = new bowlingBall("Grey", 8, 16);  //This creates a grey bowling ball
    bowlingBall Ball3 = new bowlingBall("Orange", 15, 16);  //This creates an orange bowling ball
    bowlingBallPersonal PBall1 = new bowlingBallPersonal("Lil Jimmy", "Jim");
    bowlingBallKids KBall1 = new bowlingBallKids("Green", 15, 16);

    System.out.println(Ball2); //This prints out the information of the blue bowling ball
    System.out.println(Ball1); //This prints out the information of the grey bowling ball
    System.out.println(Ball3); //This prints out the information of the orange bowling ball
    System.out.println(PBall1);
    System.out.println(KBall1);

    ArrayList bowlingBallList = new ArrayList<bowlingBall>();

    bowlingBallList.add(Ball1);
    bowlingBallList.add(Ball2);
    bowlingBallList.add(Ball3);

    System.out.println(bowlingBallList);

    Collections.sort(bowlingBallList);

    System.out.println(bowlingBallList);
    }


}  
