import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Pinky extends Character{


    Pinky(){

        try {

            idleFrames = ImageIO.read(new File("Characters/1 Pink_Monster/Pink_Monster_Idle_4.png"));
            runningFrames = ImageIO.read(new File("Characters/1 Pink_Monster/Pink_Monster_Run_6.png"));
            
        } 
        
        
        
        catch (IOException e) {
            e.printStackTrace();
        }



    }
    
}
