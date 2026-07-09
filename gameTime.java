import java.awt.Graphics2D;

public class gameTime extends Component {

    private double timeInSeconds;

    public gameTime() {
        timeInSeconds = 0;
    }

    @Override
    public void update(double dt) {
        timeInSeconds += dt;
    }

    public int getSeconds() {
        return (int) timeInSeconds;
    }

    @Override
    public void render(Graphics2D g2d) {     
        g2d.setColor(java.awt.Color.BLACK);
        g2d.drawString("Time: " + getSeconds(), 350, 50); 
    }
}