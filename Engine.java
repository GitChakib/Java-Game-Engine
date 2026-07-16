import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Engine implements Runnable{

    private List<Component> components = new ArrayList<>();    

    private JFrame window;
    private Canvas canvas;

    private Thread thread;
    private boolean running  = false;


    private final int width = 1280;
    private final int height = 720;

    private final double fps = 60.0;
    private final double timeStep = 1.0 / fps;

    public static gameTime activeTime;

public Engine() {

    window = new JFrame("Simulation");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);

    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width, height));

    activeTime = new gameTime();


    window.add(canvas);
    window.pack();
    window.setLocationRelativeTo(null); 
    window.setVisible(true);

    components.add(new score());
    components.add(new Sky());
    components.add(new Clouds());
    components.add(activeTime);
    components.add(new gameTime());
    components.add(new Durdle());
    components.add(new Ground());

    canvas.addKeyListener(new Input());

    canvas.setFocusable(true);
    canvas.requestFocusInWindow();

  }

  public void startgame(){
    if(running) return;
    running = true;
    thread = new Thread(this, "Engine Thread");
    thread.start();
  }

   private void updateFrame(double dt) {
        System.out.println("frame generated with timestep: " + dt);
    }

    private void render(Graphics2D g2d) {


    for (Component c : components) {
            c.render(g2d);
        }
    }

    private void update(double dt) {

        for (Component c : components) {
            c.update(dt);
        }
        
    }

  @Override
  public void run() {
    canvas.createBufferStrategy(2);
    BufferStrategy bufferStrategy = canvas.getBufferStrategy();

     double lastTime = System.nanoTime() / 1_000_000_000.0;
     double accumulator = 0.0;

     while (running) { 
            double currentTime = System.nanoTime() / 1_000_000_000.0;
            double passedTime = currentTime - lastTime;
            lastTime = currentTime;

            if (passedTime > 0.25) passedTime = 0.25;

            accumulator += passedTime;

            while (accumulator >= timeStep) {
                updateFrame(timeStep);
                update(timeStep);
                accumulator -= timeStep;
            }

            Graphics2D g2d = (Graphics2D) bufferStrategy.getDrawGraphics();
            g2d.clearRect(0, 0, width, height);

            render(g2d);
            g2d.dispose();
            bufferStrategy.show();
    }
  }
  public static void main(String[] args) {
    Engine engine = new Engine();
    engine.startgame();
 }
}