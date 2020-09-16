
package Part1;
import BreezySwing.*;
import TurtleGraphics.*;

/**
 *
 * @author asht5631
 */
public class ObjectExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        /*multi line comment
        objects are created from a CLASS
        pl is an INSTANCE (Object) of the pen class
        Instantiating an object = making an object
        */
        p1.move(25);
        p1.move(-30,50);
        /*p1 -> brings up a list of methods (abilities) that p1 has
        Some methods are found directly in pen
        others are INHERITED from the "Class of all Classes" -> Object Class
        examples toString, hashCode,compareTo
        */
        SketchPadWindow w= new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        /* It is common to have more than 1 way to make an object 
        Can make a pen witha  ustom window or default window
        */
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        /* 
        even though wp and rp are different TYPES of pens
        they respond the same to commands as p1
        since all 3 pens have the pen class as their parent 
        pen is where most of these methods are defined and the 3
        Actual pens inherit these methods.
        */
    }
    
}
