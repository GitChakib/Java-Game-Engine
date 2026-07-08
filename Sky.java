import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sky extends Component {

    private BufferedImage skyArray[];
    private BufferedImage currentSky;

    public Sky(){
        try {
            skyArray = new BufferedImage[8];
            skyArray[0] = ImageIO.read(new File("Skies/Clouds 1/1.png"));
            skyArray[1] = ImageIO.read(new File("Skies/Clouds 2/1.png"));
            skyArray[2] = ImageIO.read(new File("Skies/Clouds 3/1.png"));
            skyArray[3] = ImageIO.read(new File("Skies/Clouds 4/1.png"));
            skyArray[4] = ImageIO.read(new File("Skies/Clouds 5/1.png"));
            skyArray[5] = ImageIO.read(new File("Skies/Clouds 6/1.png"));
            skyArray[6] = ImageIO.read(new File("Skies/Clouds 7/1.png"));
            skyArray[7] = ImageIO.read(new File("Skies/Clouds 8/1.png"));

            currentSky = skyArray[0];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(double dt) {
    }

    public void render(Graphics2D g2d) {
        g2d.drawImage(currentSky, 0, 0, 1920, 850, null);
    }
}
