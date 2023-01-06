//This is a card game project made by Hiram Silva for the Software and Programming Dev 1 class taught by Mr. Gross
//The way the game works is each player is dealt five cards. Each cards number value is multiplied to get a players total points.
//The player with the most amount of points is the winner!

import java.util.Random;   //This imports the Random utility

public class Card {



    public static void main(String[] args){

    String AceS = "Ace of Spades";   //These create variables for each Spade card
    String TwoS = "Two of Spades";
    String ThreeS = "Three of Spades";
    String FourS = "Four of Spades";
    String FiveS = "Five of Spades";
    String SixS = "Six of Spades";
    String SevenS = "Seven of Spades";
    String EightS = "Eight of Spades";
    String NineS = "Nine of Spades";
    String TenS = "Ten of Spades";
    String JackS = "Jack of Spades";
    String QueenS = "Queen of Spades";
    String KingS = "King of Spades";
    
    String AceD = "Ace of Diamonds";   //These create variable for each Diamond card
    String TwoD = "Two of Diamonds";
    String ThreeD = "Three of Diamonds";
    String FourD = "Four of Diamonds";
    String FiveD = "Five of Diamonds";
    String SixD = "Six of Diamonds";
    String SevenD = "Seven of Diamonds";
    String EightD = "Eight of Diamonds";
    String NineD = "Nine of Diamonds";
    String TenD = "Ten of Diamonds";
    String JackD = "Jack of Diamonds";
    String QueenD = "Queen of Diamonds";
    String KingD = "King of Diamonds";
    
    String AceC = "Ace of Clubs";   //These create variables for each Clubs card
    String TwoC = "Two of Clubs";
    String ThreeC = "Three of Clubs";
    String FourC = "Four of Clubs";
    String FiveC = "Five of Clubs";
    String SixC = "Six of Clubs";
    String SevenC = "Seven of Clubs";
    String EightC = "Eight of Clubs";
    String NineC = "Nine of Clubs";
    String TenC = "Ten of Clubs";
    String JackC = "Jack of Clubs";
    String QueenC = "Queen of Clubs";
    String KingC = "King of Clubs";
    
    String AceH = "Ace of Hearts";   //These create variables for each Heart card
    String TwoH = "Two of Hearts";
    String ThreeH = "Three of Hearts";
    String FourH = "Four of Hearts";
    String FiveH = "Five of Hearts";
    String SixH = "Six of Hearts";
    String SevenH = "Seven of Hearts";
    String EightH = "Eight of Hearts";
    String NineH = "Nine of Hearts";
    String TenH = "Ten of Hearts";
    String JackH = "Jack of Heart";
    String QueenH = "Queen of Hearts";
    String KingH = "King of Hearts";
    
    //This adds all of the cards to an array called "Deck"
    String[] Deck = {AceS, TwoS, ThreeS, FourS, FiveS, SixS, SevenS, EightS, NineS, TenS, JackS, QueenS, KingS,  
    AceD, TwoD, ThreeD, FourD, FiveD, SixD, SevenD, EightD, NineD, TenD, JackD, QueenD, KingD,
    AceC, TwoC, ThreeC, FourC, FiveC, SixC, SevenC, EightC, NineC, TenC, JackC, QueenC, KingC,
    AceH, TwoH, ThreeH, FourH, FiveH, SixH, SevenH, EightH, NineH, TenH, JackH, QueenH, KingH};

    String  SAce = "1";   //This creates point versions of the Spade cards with numerical values
    String  STwo = "2";
    String  SThree = "3";
    String  SFour = "4";
    String  SFive = "5";
    String  SSix = "6";
    String  SSeven = "7";
    String  SEight = "8";
    String  SNine = "9";
    String  STen = "10";
    String  SJack = "11";
    String  SQueen = "12";
    String  SKing = "13";
      
    String  DAce = "1";   //This creates point versions of the Diamond cards with numerical values
    String  DTwo = "2";
    String  DThree = "3";
    String  DFour = "4";
    String  DFive = "5";
    String  DSix = "6";
    String  DSeven = "7";
    String  DEight = "8";
    String  DNine = "9";
    String  DTen = "10";
    String  DJack = "11";
    String  DQueen = "12";
    String   DKing = "13";
      
    String  CAce = "1";   //This creates point versions of the Club cards with numerical values
    String  CTwo = "2";
    String  CThree = "3";
    String  CFour = "4";
    String  CFive = "5";
    String  CSix = "6";
    String  CSeven = "7";
    String  CEight = "8";
    String   CNine = "9";
    String  CTen = "10";
    String  CJack = "11";
    String  CQueen = "12";
    String  CKing = "13";
      
    String  HAce = "1";   //This creates point versions of the Heart cards with numerical values
    String  HTwo = "2";
    String  HThree = "3";
    String  HFour = "4";
    String  HFive = "5";
    String  HSix = "6";
    String  HSeven = "7";
    String  HEight = "8";
    String  HNine = "9";
    String  HTen = "10";
    String  HJack = "11";
    String  HQueen = "12";
    String  HKing = "13";
  
      //This adds the point values to an array called points
      String[] Points = {SAce, STwo, SThree, SFour, SFive, SSix, SSeven, SEight, SNine, STen, SJack, SQueen, SKing,
        DAce, DTwo, DThree, DFour, DFive, DSix, DSeven, DEight, DNine, DTen, DJack, DQueen, DKing,
        CAce, CTwo, CThree, CFour, CFive, CSix, CSeven, CEight, CNine, CTen, CJack, CQueen, CKing,
        HAce, HTwo, HThree, HFour, HFive, HSix, HSeven, HEight, HNine, HTen, HJack, HQueen, HKing};

    String[] PlayerOneHand = {"0", "0", "0", "0", "0"};   //This creates an array for Player One's hand
    String[] PlayerTwoHand = {"0", "0", "0", "0", "0"};   //This creates an array for Player Two's hand

    String[] PlayerOnePoints = {"0", "0", "0", "0", "0"};   //This creates an array for Player One's points
    String[] PlayerTwoPoints = {"0", "0", "0", "0", "0"};   //This creates an array for Player Two's points

    int PlayerOneHandValue = 0;   //This creates PlayerOneHandValue and sets it to zero
    int PlayerTwoHandValue = 0;   //This creates PlayerTwoHandValue and sets it to zero
    
    for (int i = 0; i < 5; i++){  //This makes a loop that will run five times

        Random random = new Random();  //This makes Random usable

        int x = random.nextInt(52);   //This generates a random number between 0 and 51
        int y = random.nextInt(52);   //This generates a random number between 0 and 51

        PlayerOneHand[PlayerOneHandValue] = Deck[x];   //This sets the next value in Player One's hand to the random number corresponding value in the Deck
        PlayerTwoHand[PlayerTwoHandValue] = Deck[y];   //This sets the next balue in Player Two's hand to the random number corresponding value in the Deck

        PlayerOnePoints[PlayerOneHandValue] = Points[x];   //This sets the next value in Player One's points to the random number corresponding value in the Deck
        PlayerTwoPoints[PlayerTwoHandValue] = Points[y];   //This sets the next value in Player Two's points to the random number corresponding value in the Deck


        PlayerOneHandValue++;   //This increases PlayerOneHandValue by one to prepare for the next run of the loop
        PlayerTwoHandValue++;   //this increases PlayerTwoHandValue by one to prepare for the next run of the loop


    }

    System.out.println("\n");   //This adds a gap to the output

    System.out.print("Player One's Hand is: ");

    for (int j = 0; j < PlayerOneHand.length - 1; j++){   //This is a loop that prints out the value of the first four of Player One's cards

        System.out.print(PlayerOneHand[j] + ",  ");

    }

    System.out.println(PlayerOneHand[4]);   //This prints the last value of Player One's Points

    System.out.print("Player Two's Hand is: ");

    for (int h = 0; h < PlayerOneHand.length - 1; h++){   //This is a loop that prints out the value of the first four of Player Two's cards

      System.out.print(PlayerTwoHand[h] + ",  ");

    }

    System.out.println(PlayerTwoHand[4]);   //This prints the last value of Player Two's points

    System.out.println("\n");   //This adds a gap to the output

    //This sets Player One's score to the product of their points
    int PlayerOneScore = Integer.valueOf(PlayerOnePoints[0]) * 
    Integer.valueOf(PlayerOnePoints[1]) * Integer.valueOf(PlayerOnePoints[2]) * 
    Integer.valueOf(PlayerOnePoints[3]) * Integer.valueOf(PlayerOnePoints[4]);

    //This sets Player Two's score to the product of their points
    int PlayerTwoScore = Integer.valueOf(PlayerTwoPoints[0]) * 
    Integer.valueOf(PlayerTwoPoints[1]) * Integer.valueOf(PlayerTwoPoints[2]) * 
    Integer.valueOf(PlayerTwoPoints[3]) * Integer.valueOf(PlayerTwoPoints[4]);

    System.out.println("Player One's Total Score is: " + PlayerOneScore);   //This prints out Player One's total score
    System.out.println("Player Two's Total Score is: " + PlayerTwoScore);   //This prints out Player Two's total score

    System.out.println("\n");   //This adds a gap to the output


    if (PlayerOneScore - PlayerTwoScore < 0){  //This announces that Player Two wins if Player Two's score is greater than Player One's

      System.out.println("Player Two Wins!");

    }
    else if (PlayerOneScore - PlayerTwoScore == 0){   //This announces that there is a tie when both Player's scores are the same

      System.out.println("It's a tie!");

    }
    else if(PlayerOneScore - PlayerTwoScore > 0){   //This announces that Player One wins if Player One's score is greater than Player Two's

      System.out.println("Player One Wins!");

    }

    System.out.println("\n");   //This adds a gap to the output

 
  }
}
