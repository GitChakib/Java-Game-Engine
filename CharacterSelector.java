import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;



public class CharacterSelector extends Component {

    private Input input;
    private boolean isSelected = false;
    private int HoverPosX;
    private int HoverPosY;
    private int selectedCharacterIndex = 0;
    private BufferedImage SelectScreen;
    private boolean rightWasPressed = false;
    private boolean leftWasPressed = false;
    private boolean enterWasPressed = false;

    public CharacterSelector() {
        try {

            SelectScreen = ImageIO.read(new File("Characters/CharacterSelector.png"));
            
        } catch (Exception e) {
        }
    }

    @Override
    public void update(double dt) {

        boolean rightIsDown = Input.isKeyPressed(KeyEvent.VK_RIGHT);
        boolean leftIsDown  = Input.isKeyPressed(KeyEvent.VK_LEFT);
        boolean enterIsDown = Input.isKeyPressed(KeyEvent.VK_ENTER);


        if (rightIsDown && !rightWasPressed) {

            selectedCharacterIndex = (selectedCharacterIndex + 1) % 3;


        }
        if (leftIsDown && !leftWasPressed) {

            selectedCharacterIndex = (selectedCharacterIndex - 1 + 3) % 3;

        }

        if (selectedCharacterIndex == 0) {
                HoverPosX = 515;
                HoverPosY = 250;
            } else if (selectedCharacterIndex == 1) {
                HoverPosX = 635;
                HoverPosY = 250;
            } else if (selectedCharacterIndex == 2) {
                HoverPosX = 575;
                HoverPosY = 370;
            }

        if(enterIsDown && !enterWasPressed) {

            isSelected = true;

            if (selectedCharacterIndex == 0) {

                Engine.addComponent(new Owly());
            }
            else if (selectedCharacterIndex == 1) {

                Engine.addComponent(new Pinky());
            }
            else if (selectedCharacterIndex == 2) {

                Engine.addComponent(new Durdle());
            }
        }

        rightWasPressed = rightIsDown;
        leftWasPressed = leftIsDown;
        enterWasPressed = enterIsDown;

}
@Override

    public void render(Graphics2D g2d) {
        if (isSelected) {
            return;
        }
        g2d.drawImage(SelectScreen, 500, 200,220, 300, null);
        g2d.setColor(java.awt.Color.ORANGE);
        g2d.drawString("Press Enter to Select --- Use Arrow Keys to Navigate --- Use WASD to Move", 150, 100);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRoundRect(HoverPosX, HoverPosY, 70, 100, 20, 20);
    }
}
