public class bowlingBallKids extends bowlingBall{

public bowlingBallKids (String ballColor, int ballWeight, int ballSize){ //The bowlingBall constructor needs the balls color, weight, and size

    super(ballColor, ballWeight, ballSize);

       if(this.weight > 5){
        this.weight = 4;
       }
}
}
