import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Engine implements Runnable{

    private JFrame window;
    private Canvas canvas;

    private Thread thread;
    private boolean running  = false;


    private final int width = 800;
    private final int height = 600;

    private final double fps = 60.0;
    private final double timeStep = 1.0 / fps;

public Engine() {

    window = new JFrame("Simulation");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);

    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width, height));

    window.add(canvas);
    window.pack();
    window.setLocationRelativeTo(null); 
    window.setVisible(true);

  }

  public void startgame(){
    if(running) return;
    running = true;
    thread = new Thread(this, "Engine Thread");
    thread.start();
  }

   private void update(double dt) {
        System.out.println("frame generated with timestep: " + dt);
    }

    private void render(Graphics2D g2d) {
      g2d.setColor(java.awt.Color.BLACK);
      g2d.drawString("Engine working", 400, 300);
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