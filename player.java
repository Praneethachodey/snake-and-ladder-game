public class player{
 int position_of_player;
 int dice=0;
 int option=0;
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

 void chooseOption()
  {
   option=(int)Math.floor(Math.random()*3);
   switch(option){
     case 0:
      System.out.println("no play");
      break;
    
     case 1:
      System.out.println("ladder");
      position_of_player+= dice;
      break;
  
     case 2:
      System.out.println("snake");
      position_of_player-= dice;
      break;}
   }
      
}