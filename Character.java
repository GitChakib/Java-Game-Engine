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
    private int width = 32;
    private int height = 32;
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
        isFacingRight = false;

    }
    if (input.isKeyPressed(KeyEvent.VK_D)) {

        posX += 5;
        isFacingRight = true;

    }

    if (posX <= 0) {
        posX = 0;
    }
    if (posX >= 1230) {
        posX = 1230;
    }
    if (posY <= 610) {
        posY = 610;
    }
    if (posY >= 605) {
        posY = 605;
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

        if (isFacingRight) {
            g2d.drawImage(
                idleFrames,
                (int)posX, (int)posY,                       
                (int)posX + 64, (int)posY + 64, 
                sourceX1, sourceY1,                      
                sourceX2, sourceY2,                      
                null);
        } else {
            g2d.drawImage(
                idleFrames,
                (int)posX + 64, (int)posY,                       
                (int)posX, (int)posY + 64, 
                sourceX1, sourceY1,                      
                sourceX2, sourceY2,                      
                null);
        }
    }
}