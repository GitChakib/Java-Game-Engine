import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;



public class CharacterSelector extends Component {

    private Input input;
    private boolean isSelected = false;
    private int HoverPosX = 630;
    private int HoverPosY = 220;
    private int selectedCharacterIndex = 0;
    private BufferedImage SelectScreen;
    private BufferedImage[] SelectHover;

    public CharacterSelector() {
        try {

            SelectScreen = ImageIO.read(new File("Characters/CharacterSelector.png"));
            
        } catch (Exception e) {
        }
    }

    @Override
    public void update(double dt) {
        if (input.isKeyPressed(KeyEvent.VK_RIGHT)) {

            selectedCharacterIndex = (selectedCharacterIndex++) % 3;


        }
        if (input.isKeyPressed(KeyEvent.VK_LEFT)) {

            selectedCharacterIndex = (selectedCharacterIndex--) % 3;

        }

}
@Override

    public void render(Graphics2D g2d) {
        g2d.drawImage(SelectScreen, 500, 200,220, 300, null);
        g2d.setColor(java.awt.Color.ORANGE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRoundRect(HoverPosX, HoverPosY, 70, 100, 20, 20);
    }
}
