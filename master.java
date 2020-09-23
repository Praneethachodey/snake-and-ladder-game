public class master{

public static void main(String[] args)
{
System.out.println("welcome to snake and ladder game");
player p1 = new player();
int dice=0;
while(p1.position_of_player<100){
dice = p1.rollDice();
System.out.println("number on dice : " + dice);
p1.chooseOption();
}
System.out.println("number of times the dice was rolled :" +p1.noOfDice);
}
}