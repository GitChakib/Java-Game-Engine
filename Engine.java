import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Engine implements Runnable{

    private JFrame window;
    private Canvas canvas;

    private Thread thread;
    private boolean running  = false;


    private final int width = 800;
    private final int height = 600;

    private final double fps = 60.0;
    private final double tickrate = 1.0 / fps;

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
    if(isRunning) return;
    isRunning = true;
    engineThread = new Thread(this, "Engine Thread");
    engineThread.start();
  }

  @Override
  public void run() {
    canvas.createBufferStrategy(2);
    BufferStrategy bufferStrategy = canvas.getBufferStrategy();

     double lastTime = System.nanoTime() / 1_000_000_000.0;
     double accumulator = 0.0;



  }
}