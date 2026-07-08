import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Clouds extends Component {
    private BufferedImage cloudArray[];
    private BufferedImage currentcloud;

    public Clouds(){
        try {
            cloudArray = new BufferedImage[12];
            cloudArray[0] = ImageIO.read(new File("Skies/Clouds 1/2.png"));
            cloudArray[1] = ImageIO.read(new File("Skies/Clouds 1/3.png"));
            cloudArray[2] = ImageIO.read(new File("Skies/Clouds 1/4.png"));
            cloudArray[3] = ImageIO.read(new File("Skies/Clouds 2/2.png"));
            cloudArray[4] = ImageIO.read(new File("Skies/Clouds 2/3.png"));
            cloudArray[5] = ImageIO.read(new File("Skies/Clouds 2/4.png"));
            cloudArray[6] = ImageIO.read(new File("Skies/Clouds 3/2.png"));
            cloudArray[7] = ImageIO.read(new File("Skies/Clouds 3/3.png"));
            cloudArray[8] = ImageIO.read(new File("Skies/Clouds 3/4.png"));
            cloudArray[9] = ImageIO.read(new File("Skies/Clouds 4/2.png"));
            cloudArray[10] = ImageIO.read(new File("Skies/Clouds 4/3.png"));
            cloudArray[11] = ImageIO.read(new File("Skies/Clouds 4/4.png"));

            currentcloud = cloudArray[0];

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(double dt) {
    }

    public void render(Graphics2D g2d) {
        g2d.drawImage(currentcloud, 0, 0, 1920, 850, null);
    }

}

