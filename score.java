import java.awt.Font;
import java.awt.Graphics2D;


public class score extends Component {

    Font myFont = new Font("Arial", Font.BOLD, 24);

    private int score = 0;

    public void update(double dt) {
    }

    public void render(Graphics2D g2d) {
        
        g2d.setColor(java.awt.Color.BLACK);
        g2d.setFont(myFont);
        g2d.drawString("Score: " + score, 350, 20);
    }


}
