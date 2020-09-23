public class master{

public static void main(String[] args)
{
System.out.println("welcome to snake and ladder game");
player p1 = new player();
int dice=0;
dice = p1.rollDice();
System.out.println("number on dice : " + dice);
}
}