import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;




public class CharacterSelector extends Component{

    private BufferedImage SelectWindow;

    private int posX;
    private int posY;

    private boolean isSelected = false;

    CharacterSelector(){

        try {

            SelectWindow = ImageIO.read(new File("Characters/CharacterSelector.png"));
            
        } 
        
        
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void update (double dt){

        if (isSelected = false){



        }

    
    }

    @Override
    public void render(Graphics2D g2d){

        g2d.drawImage(SelectWindow, 450, 200, 300, 350, null);

    }



    
}
