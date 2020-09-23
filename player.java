public class player{
 int position_of_player;
 int dice=0;
 public player()
  {
   position_of_player=0;
   System.out.println("player created with starting point: 0 ");
  }
 
 int rollDice()
  {
   dice =(int)Math.floor(Math.random()*6)+1;
   return dice;
  } 

}