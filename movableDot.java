import java.awt.Graphics2D;
import java.awt.event.KeyEvent;



public class movableDot extends Component {

    private Input input;
    private int posX;
    private int posY;

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

}


}
