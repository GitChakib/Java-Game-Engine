import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class Ground extends Component{

    private List<Tile> tiles = new ArrayList<>();
    private BufferedImage textures[] = new BufferedImage[8];

    public Ground(){

        try {
            textures[0] = ImageIO.read(new File("Enviornment/Tiles/tile23.png"));
            textures[1] = ImageIO.read(new File("Enviornment/Tiles/tile24.png"));
            textures[2] = ImageIO.read(new File("Enviornment/Tiles/tile25.png"));
            textures[3] = ImageIO.read(new File("Enviornment/Tiles/tile26.png"));
            textures[4] = ImageIO.read(new File("Enviornment/Tiles/tile27.png"));
            textures[5] = ImageIO.read(new File("Enviornment/Tiles/tile28.png"));
            textures[6] = ImageIO.read(new File("Enviornment/Tiles/tile29.png"));
            textures[7] = ImageIO.read(new File("Enviornment/Tiles/tile30.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        int tileWidth = 36;
        int tileHeight = 36;
        int groundHeight = 850;

        for (int i = 0; i < 8; i++) {
            int posX = i * tileWidth;
            int posY = groundHeight;
            BufferedImage texture = textures[i];
            tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
        }
          }


        public void update(double dt) {
        }
        public void render(Graphics2D g2d){

            for (Tile tile : tiles) {
                tile.render(g2d);
            }
        }
    
}
