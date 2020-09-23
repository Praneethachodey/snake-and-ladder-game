public class master{

 public static void main(String[] args)
  {
  System.out.println("welcome to snake and ladder game");
  player p1 = new player();
  player p2=new player();

  while(p1.position_of_player<100 && p2.position_of_player<100)
   {
   System.out.println("player 1 playing");
   p1.rollDice();
   p1.chooseOption();
   System.out.println("position of player 1: "+ p1.position_of_player);
   if(p1.position_of_player==100) break;
   System.out.println("player 2 playing");
   p2.rollDice();
   p2.chooseOption();
   System.out.println("position of player 2:" + p2.position_of_player);
   }

  if(p1.position_of_player==100){
  System.out.println("player 1 wins and number of times the dice was rolled :" +p1.noOfDice);
}
 else 
  System.out.println("player 2 wins and number of times the dice was rolled : " +p2.noOfDice);
}
}