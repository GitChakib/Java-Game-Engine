import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class colorController extends Component {

    private Input input;


    private Color[] colors = {Color.BLACK, Color.WHITE, Color.RED, Color.GREEN, Color.BLUE};
    private int currentColorIndex = 0;

    private boolean wasKeyPressedLastFrame = false;

    public colorController (Input input) {
    this.input = input;
}


@Override
public void update(double dt) {
    boolean isKeyPressed = input.iskeyPressed(KeyEvent.VK_SPACE);
    if (isKeyPressed && !wasKeyPressedLastFrame) {
        currentColorIndex = (currentColorIndex + 1) % colors.length;
    }
    wasKeyPressedLastFrame = isKeyPressed;
}

@Override
public void render(Graphics2D g2d) {
    g2d.setColor(colors[currentColorIndex]);
    g2d.fillRect(0, 0, 800, 600);
}
}