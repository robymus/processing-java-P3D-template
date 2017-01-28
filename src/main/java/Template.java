// import processing classes and constants
import processing.core.*;
import static processing.core.PConstants.*;

/**
 * Main class should extend PApplet
 */
public class Template extends PApplet {

    private float t = 0;

    /**
     * Size must be set in settings
     */
    @Override
    public void settings() {
        size(1280, 720, P3D);
    }

    /**
     * setup works as in processing
     */
    @Override
    public void setup() {
        frameRate(60);
    }

    /**
     * draw works as in processing
     */
    @Override
    public void draw() {
        background(0);

        camera(0, -100, -200, 0, 0, 0, 0, 1, 0);        
        pointLight(255, 255, 255, 50, -250, -150);

        noStroke();
        fill(250, 100, 250);
        rotateY(t);
        box(150);

        t += 0.01;
    }

    /**
     * Bootstrap processing
     */
    public static void main(String[] args) {
        PApplet.main(Template.class, args);
    }
}