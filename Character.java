import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;



public class Character extends Component {

    private Input input;
    private int posX = 400;
    private int posY = 300;
    private int width = 50;
    private int height = 50;
    private boolean isFacingRight = true;

    private BufferedImage frame;

    public Character(int posX, int posY, int width, int height, BufferedImage frame) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

@Override
public void update(double dt) {
    if (input.isKeyPressed(KeyEvent.VK_W)) {
        
        posY -= 5;

    }
    if (input.isKeyPressed(KeyEvent.VK_S)) {
        
        posY += 5;

    }
    if (input.isKeyPressed(KeyEvent.VK_A)) {
        
        posX -= 5;

    }
    if (input.isKeyPressed(KeyEvent.VK_D)) {

        posX += 5;

    }

    if (posX <= 0) {
        posX = 0;
    }
    if (posX >= 1900) {
        posX = 1900;
    }
    if (posY <= 0) {
        posY = 0;
    }
    if (posY >= 1040) {
        posY = 1040;
    }

}

public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    @Override
    public void render(Graphics2D g2d) {

        if (frame == null) return;

        if (isFacingRight){

            g2d.drawImage(frame, posX, posY, width, height, null);
        } else {
            g2d.drawImage(frame, posX + width, posY, -width, height, null);

        }
        
    }


}
