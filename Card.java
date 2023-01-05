public class Card {

String AceS = "Ace of Spades";
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

String AceD = "Ace of Diamonds";
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

String AceC = "Ace of Clubs";
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

String AceH = "Ace of Hearts";
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

String[] Deck = {AceS, TwoS, ThreeS, FourS, FiveS, SixS, SevenS, EightS, NineS, TenS, JackS, QueenS, KingS,
AceD, TwoD, ThreeD, FourD, FiveD, SixD, SevenD, EightD, NineD, TenD, JackD, QueenD, KingD,
AceC, TwoC, ThreeC, FourC, FiveC, SixC, SevenC, EightC, NineC, TenC, JackC, QueenC, KingC,
AceH, TwoH, ThreeH, FourH, FiveH, SixH, SevenH, EightH, NineH, TenH, JackH, QueenH, KingH};

String card = Deck[18];


public static void main(String[] args){

System.out.println(card);
}

}
