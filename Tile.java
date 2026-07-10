import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Tile extends Component{

    private int posX;
    private int posY;
    private int width;
    private int height;
    private BufferedImage texture;

    public Tile(int posX, int posY, BufferedImage texture, int width, int height) {

        this.posX = posX;
        this.posY = posY;
        this.texture = texture;
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(double dt) {
}
    @Override
    public void render(Graphics2D g2d) {
        g2d.drawImage(texture, posX, posY, width, height, null);
    }
}
