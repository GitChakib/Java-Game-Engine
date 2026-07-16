import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;




public class CharacterSelector extends Component{

    private BufferedImage SelectWindow;

    private int posX;
    private int posY;

    CharacterSelector(){

        try {

            SelectWindow = ImageIO.read(new File("Characters/1 Pink_Monster/Pink_Monster_Idle_4.png"));
            
        } 
        
        
        
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    




    
}
