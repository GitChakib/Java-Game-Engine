import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;



public class CharacterSelector extends Component {

    private Input input;
    int posX;
    int posY;
    private BufferedImage SelectScreen;
    private BufferedImage[] SelectBorder;

    public CharacterSelector() {
        try {

            SelectScreen = ImageIO.read(new File("Characters/CharacterSelector.png"));
            
        } catch (Exception e) {
        }
    }

    @Override
    public void update(double dt) {
        if (input.isKeyPressed(KeyEvent.VK_D)) {
            posX = 100;
            posY = 100;
        }

}
}
