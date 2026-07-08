import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Background extends Component {

    private BufferedImage currentSky;
    private BufferedImage currentCloud;

    public Background(){
        try {
            currentSky = ImageIO.read(new File("Skies/Clouds 1/1.png"));
            currentCloud = ImageIO.read(new File("Skies/Clouds 1/4.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(double dt) {
    }

    public void render(Graphics2D g2d) {
        g2d.drawImage(currentSky, 0, 0, null);
        g2d.drawImage(currentCloud, 0, 0, null);
    }


    
}
