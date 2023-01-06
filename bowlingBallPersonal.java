public class bowlingBallPersonal extends bowlingBall {
    String nickname;
    String owner;

    public bowlingBallPersonal(String nickname, String ballOwner) {
        super("black", 12, 16);
        this.nickname = nickname;
        owner = ballOwner;
        
    }
    public String toString(){
        return "Owner: " + owner + " Bowling Ball Nickname: " + nickname + " " + color + " " + size + " cm " + weight + " lb";
    }

}
