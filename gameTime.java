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
    int seconds = (int) timeInSeconds % 60;  

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void render(Graphics2D g2d) {      
    }
}