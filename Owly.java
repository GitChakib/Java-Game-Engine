import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Owly extends Character{

    Owly(){

        try {

            idleFrames = ImageIO.read(new File("Characters/2 Owlet_Monster/Owlet_Monster_Idle_4.png"));
            runningFrames = ImageIO.read(new File("Characters/2 Owlet_Monster/Owlet_Monster_Run_6.png"));
            
        } 
        
        
        
        catch (IOException e) {
            e.printStackTrace();
        }



    }
    


}



