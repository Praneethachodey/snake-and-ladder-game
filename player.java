public class player{
 int position_of_player;
 int dice=0;
 int option=0;
int noOfDice=0;
 public player()
  {
   position_of_player=0;
   System.out.println("player created with starting point: 0 ");
  }
 
 int rollDice()
  {
   dice =(int)Math.floor(Math.random()*6)+1;
   noOfDice++;
   System.out.println("number on dice: " +dice);
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
      if(position_of_player+dice<=100)
      position_of_player+= dice;
      if(position_of_player==100) break;
      System.out.println("position of player:" +position_of_player);
      System.out.println("ladder so playing again");
      rollDice();
      chooseOption();
      break;
  
     case 2:
      System.out.println("snake");
      position_of_player-= dice;
      if(position_of_player<0) position_of_player=0;      
      break;}
    
   }
      
}