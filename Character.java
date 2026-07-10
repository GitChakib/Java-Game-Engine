import java.awt.Graphics2D;
import java.awt.event.KeyEvent;



public class Character extends Component {

    private Input input;
    private int posX = 400;
    private int posY = 300;

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

    @Override
    public void render(Graphics2D g2d) {
        
    }


}
