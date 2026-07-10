import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;

public class Ground extends Component{

    private List<Tile> tiles = new ArrayList<>();
    private BufferedImage textures[] = new BufferedImage[8];
    private Random random = new Random();
    private BufferedImage undergroundTextures[] = new BufferedImage[4];

    public Ground(){

        try {
            textures[0] = ImageIO.read(new File("Enviornment/Tiles/tile23.png"));
            textures[1] = ImageIO.read(new File("Enviornment/Tiles/tile24.png"));
            textures[2] = ImageIO.read(new File("Enviornment/Tiles/tile45.png"));
            textures[3] = ImageIO.read(new File("Enviornment/Tiles/tile46.png"));
            textures[4] = ImageIO.read(new File("Enviornment/Tiles/tile27.png"));
            textures[5] = ImageIO.read(new File("Enviornment/Tiles/tile28.png"));
            textures[6] = ImageIO.read(new File("Enviornment/Tiles/tile29.png"));
            textures[7] = ImageIO.read(new File("Enviornment/Tiles/tile45.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            undergroundTextures[0] = ImageIO.read(new File("Enviornment/Tiles/tile11.png"));
            undergroundTextures[1] = ImageIO.read(new File("Enviornment/Tiles/tile39.png"));
            undergroundTextures[2] = ImageIO.read(new File("Enviornment/Tiles/tile42.png"));
            undergroundTextures[3] = ImageIO.read(new File("Enviornment/Tiles/tile118.png"));

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        int tileWidth = 50;
        int tileHeight = 50;
        int groundHeight = 500;

        for (int i = 0; i < 26; i++) {
            int posX = i * tileWidth;
            int posY = groundHeight;
            BufferedImage texture = textures[i % textures.length];
            tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
        }

        for (int i = 0; i < 104; i++) {
            if (i < 26) {
                int posX = i * tileWidth;
                int posY = groundHeight + tileHeight;
                BufferedImage texture = undergroundTextures[random.nextInt(undergroundTextures.length)];
                tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
            } else if (i < 52) {
                int posX = (i - 26) * tileWidth;
                int posY = groundHeight + 2 * tileHeight;
                BufferedImage texture = undergroundTextures[random.nextInt(undergroundTextures.length)];
                tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
            } else if (i < 78) {
                int posX = (i - 52) * tileWidth;
                int posY = groundHeight + 3 * tileHeight;
                BufferedImage texture = undergroundTextures[random.nextInt(undergroundTextures.length)];
                tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
            } else {
                int posX = (i - 78) * tileWidth;
                int posY = groundHeight + 4 * tileHeight;
                BufferedImage texture = undergroundTextures[random.nextInt(undergroundTextures.length)];
                tiles.add(new Tile(posX, posY, texture, tileWidth, tileHeight));
            }
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
