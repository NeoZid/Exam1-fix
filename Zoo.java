import java.util.ArrayList;


public class Zoo
{
   
    
    
    private ArrayList<Bird> zooBirds;
    
   /*
    *   int countBlueBirds(){
    *   String name = "blue"
    *   index = 0;
    *   while (Bird.color=="blue")
    *   index++;
    *
    *
    *   }
    */ 
    
   public Zoo(){
    zooBirds=new ArrayList<>();
    zooBirds.add( new Bird("blue","BlueJay",2));
    }
   
   
   
   int countBlueBirds(){
    int count=0;
    for (Bird filename : zooBirds){
        if(filename.getColor().equals("Blue")){
        count++;
        }
    }
    return count;
    }
}
