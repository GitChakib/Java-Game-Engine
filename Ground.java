import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Ground extends Component {

    private BufferedImage groundArray[];

    public Ground(int selectedGround) {
        try {
            groundArray = new BufferedImage[8];
            groundArray[0] = ImageIO.read(new File("Enviornment/Tiles/tile22.png"));
            groundArray[1] = ImageIO.read(new File("Enviornment/Tiles/tile23.png"));
            groundArray[2] = ImageIO.read(new File("Enviornment/Tiles/tile24.png"));
            groundArray[3] = ImageIO.read(new File("Enviornment/Tiles/tile25.png"));
            groundArray[4] = ImageIO.read(new File("Enviornment/Tiles/tile26.png"));
            groundArray[5] = ImageIO.read(new File("Enviornment/Tiles/tile27.png"));
            groundArray[6] = ImageIO.read(new File("Enviornment/Tiles/tile28.png"));
            groundArray[7] = ImageIO.read(new File("Enviornment/Tiles/tile29.png"));

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Override
    public void update(double dt) {
}
    @Override
    public void render(Graphics2D g2d) {

        for (int i = 0; i < 8; i++) {
            g2d.drawImage(groundArray[i], i * 240, 800, 36, 36, null);
        }
    }
}
