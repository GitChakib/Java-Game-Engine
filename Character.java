import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class Character extends Component {

    private Input input;
    private int posX = 400;
    private int posY = 300;
    private int width = 24;
    private int height = 36;
    private boolean isFacingRight = true;


    private BufferedImage runningFrames;
    private BufferedImage idleFrames;

    private int spaceBetweenFramesX = 0;
    private int spaceBetweenFramesY = 1;
    private int totalIdleFrames = 4;
    private int totalRunningFrames = 6;

    private int currentFrameIndex = 0;

    private double frameTimer = 0.0;
    private double timePerFrame = 0.125;

    private BufferedImage currentImage;


    public Character() {

        try {

            idleFrames = ImageIO.read(new File("Characters/1 Pink_Monster/Pink_Monster_Idle_4.png"));
        }

        catch (IOException e) {
            e.printStackTrace();
        }
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

    
    frameTimer += dt;

    if (frameTimer >= timePerFrame) {
        frameTimer -= timePerFrame;
        currentFrameIndex = (currentFrameIndex + 1) % totalIdleFrames;
    }

}

public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    @Override
    public void render(Graphics2D g2d) {


        if (idleFrames == null) return;

        int sourceX1 = currentFrameIndex * (width + spaceBetweenFramesX);
        int sourceY1 = 0;

        int sourceX2 = sourceX1 + width;
        int sourceY2 = sourceY1 + height;

g2d.drawImage(
            idleFrames,
            (int)posX, (int)posY,                       
            (int)posX + width, (int)posY + height, 
            sourceX1, sourceY1,                      
            sourceX2, sourceY2,                      
            null);

}
}